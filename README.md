Inmo Air公共组件库 --- 网络请求
step 1: <uses-permission android:name="android.permission.INTERNET" />
step 2: application onCreate()方法中做初始化
AndroidNetworking.initialize(getApplicationContext());

get
AndroidNetworking.get("http://api.localhost.com/{pageNumber}/test")

                 .addPathParameter("pageNumber", "0")

                 .addQueryParameter("limit", "3")

                 .addHeaders("token", "1234")

                 .setTag("test")

                 .setPriority(Priority.LOW)

                 .build()

                 .getAsJSONArray(new JSONArrayRequestListener() {

                    @Override

                    public void onResponse(JSONArray response) {

                    // do anything with response

                    }

                    @Override

                    public void onError(ANError error) {

                    // handle error

                    }

                });

post
AndroidNetworking.post("http://api.localhost.com/createAnUser")

                 .addBodyParameter("firstname", "Amit")

                 .addBodyParameter("lastname", "Shekhar")

                 .setTag("test")

                 .setPriority(Priority.MEDIUM)

                 .build()

                 .getAsJSONArray(new JSONArrayRequestListener() {

                    @Override

                    public void onResponse(JSONArray response) {

                    // do anything with response

                    }

                    @Override

                    public void onError(ANError error) {

                    // handle error

                    }

                });

download
AndroidNetworking.download(url,dirPath,fileName)

                 .setTag("downloadTest")

                 .setPriority(Priority.MEDIUM)

                 .build()

                 .setDownloadProgressListener(new DownloadProgressListener() {

                    @Override

                    public void onProgress(long bytesDownloaded, long totalBytes) {

                    // do anything with progress  

                    }

                 })

                 .startDownload(new DownloadListener() {

                    @Override

                    public void onDownloadComplete() {

                    // do anything after completion

                    }

                    @Override

                    public void onError(ANError error) {

                    // handle error    

                    }

                });

upload
AndroidNetworking.upload(url)

                 .addMultipartFile("image",file)    

                 .setTag("uploadTest")

                 .setPriority(Priority.IMMEDIATE)

                 .build()

                 .setUploadProgressListener(new UploadProgressListener() {

                    @Override

                    public void onProgress(long bytesUploaded, long totalBytes) {

                    // do anything with progress 

                    }

                 })

                 .getAsJSONObject(new JSONObjectRequestListener() {

                    @Override

                    public void onResponse(JSONObject response) {

                    // do anything with response                

                    }

                    @Override

                    public void onError(ANError error) {

                    // handle error 

                    }

                 });