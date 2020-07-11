public class Client {
    public static void main(String[] args) {
        String url = "https://data18.chiasenhac.com/downloads/2011/1/2010847-1f89aafb/128/Hong%20Nhan%20-%20Jack.mp3";
        String userAgent = "Drovenger";
        String destination = "download\\";

        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy();
        fileDownloaderProxy.download(userAgent, url, destination);
    }
}
