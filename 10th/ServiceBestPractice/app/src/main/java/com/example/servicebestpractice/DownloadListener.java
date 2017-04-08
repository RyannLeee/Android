package com.example.servicebestpractice;

/**
 * Created by Y-Lee on 2017/4/8.
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();

}
