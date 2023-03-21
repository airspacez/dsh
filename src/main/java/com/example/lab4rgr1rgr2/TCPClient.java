package com.example.lab4rgr1rgr2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.example.lab4rgr1rgr2.Controller.alina;
import static com.example.lab4rgr1rgr2.Controller.dasha;
import static com.example.lab4rgr1rgr2.Main.math;

public class TCPClient {
    public static void main(String[] args) {
        ExecutorService thread1 = Executors.newSingleThreadExecutor();
        thread1.execute(() -> {
            Socket socket;
            try {
                int port = 8888;
                socket = new Socket("localhost", port);
                String ratingAlina;
                String ratingDasha;
                String lateMsg = "";
                while (true) {
                    if (socket.isConnected()) {
                        if(alina == null) {
                            ratingAlina = "Студент Alina не найден.";
                        } else {
                            ratingAlina = "У Алины изменен средний рейтинг. Теперь: " + math.getAverageRating(alina,math);
                        }
                        if (dasha == null) {
                            ratingDasha = "Студент Dasha не найден.";
                        } else {
                            ratingDasha = "У Dasha изменен средний рейтинг. Теперь: " + math.getAverageRating(dasha, math);
                        }
                        String msg = ratingAlina + "\n" + ratingDasha;
                        if (!msg.equals(lateMsg)) {
                            System.out.println(msg);
                            OutputStream outputStream = socket.getOutputStream();
                            outputStream.write(msg.getBytes());
                            lateMsg = msg;
                        }
                    } else {
                        System.out.println("Соединение с сервером потеряно. Попытка переподключения...");
                        socket = new Socket("localhost", port);
                        lateMsg = "";
                    }
                    Thread.sleep(500);
                }
            } catch (IOException e) {
                System.out.println("Сервер выключен");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });
    }
}
