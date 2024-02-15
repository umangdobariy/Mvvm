package allvideo.photo.downloader.mvvmdemoapi.resource

class UnauthorizedException : Exception {
    constructor(message: String?) : super(message)
    constructor(message: String?, throwable: Throwable?) : super(message, throwable)
    constructor() : super(null, null)
}