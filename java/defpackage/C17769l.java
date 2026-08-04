package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import ealvatag.tag.datatype.DataTypes;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًْ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17769l {
    public static final byte[] Signature;
    public static final byte[] ad;
    public static final int[] adcel;
    public static final byte[] ads;
    public static final byte[] advert;
    public static final byte[] applovin;
    public static final byte[] appmetrica;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final byte[] f34594catch;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static final byte[] f34595else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static final Set f34596extends;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static final HashMap f34597for;
    public static final String[] inmobi;
    public static final byte[] isVip;
    public static final byte[] license;
    public static final boolean metrica = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static final HashMap[] f34598native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static final byte[] f34599package;
    public static final byte[] premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static final HashMap[] f34600private;
    public static final byte[] pro;
    public static final byte[] signatures;
    public static final int[] startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static final C13534l[][] f34601strictfp;
    public static final byte[] subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final C13534l f34602synchronized;
    public static final byte[] tapsense;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static final Charset f34603throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static final int[] f34604throws;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static final C13534l[] f34605volatile;
    public ByteOrder admob;
    public int amazon;
    public final HashMap[] billing;
    public final AssetManager.AssetInputStream crashlytics;
    public int firebase;
    public int isPro;
    public final FileDescriptor loadAd;
    public final HashSet mopub;
    public final boolean purchase;
    public int remoteconfig;
    public int smaato;
    public boolean subs;
    public C2598l vip;
    public final String yandex;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        startapp = new int[]{8, 8, 8};
        adcel = new int[]{8};
        ads = new byte[]{-1, -40, -1};
        subscription = new byte[]{102, 116, 121, 112};
        tapsense = new byte[]{109, 105, 102, 49};
        Signature = new byte[]{104, 101, 105, 99};
        license = new byte[]{97, 118, 105, 102};
        pro = new byte[]{97, 118, 105, 115};
        ad = new byte[]{79, 76, 89, 77, 80, 0};
        advert = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        isVip = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        signatures = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        premium = new byte[]{82, 73, 70, 70};
        applovin = new byte[]{87, 69, 66, 80};
        appmetrica = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        inmobi = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f34604throws = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f34599package = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C13534l[] c13534lArr = {new C13534l("NewSubfileType", 254, 4), new C13534l("SubfileType", 255, 4), new C13534l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, 4, "ImageWidth"), new C13534l(257, 3, 4, "ImageLength"), new C13534l("BitsPerSample", 258, 3), new C13534l("Compression", 259, 3), new C13534l("PhotometricInterpretation", 262, 3), new C13534l("ImageDescription", 270, 2), new C13534l("Make", 271, 2), new C13534l("Model", 272, 2), new C13534l(273, 3, 4, "StripOffsets"), new C13534l("Orientation", 274, 3), new C13534l("SamplesPerPixel", 277, 3), new C13534l(278, 3, 4, "RowsPerStrip"), new C13534l(279, 3, 4, "StripByteCounts"), new C13534l("XResolution", 282, 5), new C13534l("YResolution", 283, 5), new C13534l("PlanarConfiguration", 284, 3), new C13534l("ResolutionUnit", 296, 3), new C13534l("TransferFunction", 301, 3), new C13534l("Software", 305, 2), new C13534l(DataTypes.OBJ_DATETIME, 306, 2), new C13534l("Artist", 315, 2), new C13534l("WhitePoint", 318, 5), new C13534l("PrimaryChromaticities", 319, 5), new C13534l("SubIFDPointer", 330, 4), new C13534l("JPEGInterchangeFormat", 513, 4), new C13534l("JPEGInterchangeFormatLength", 514, 4), new C13534l("YCbCrCoefficients", 529, 5), new C13534l("YCbCrSubSampling", 530, 3), new C13534l("YCbCrPositioning", 531, 3), new C13534l("ReferenceBlackWhite", 532, 5), new C13534l("Copyright", 33432, 2), new C13534l("ExifIFDPointer", 34665, 4), new C13534l("GPSInfoIFDPointer", 34853, 4), new C13534l("SensorTopBorder", 4, 4), new C13534l("SensorLeftBorder", 5, 4), new C13534l("SensorBottomBorder", 6, 4), new C13534l("SensorRightBorder", 7, 4), new C13534l("ISO", 23, 3), new C13534l("JpgFromRaw", 46, 7), new C13534l("Xmp", 700, 1)};
        C13534l[] c13534lArr2 = {new C13534l("ExposureTime", 33434, 5), new C13534l("FNumber", 33437, 5), new C13534l("ExposureProgram", 34850, 3), new C13534l("SpectralSensitivity", 34852, 2), new C13534l("PhotographicSensitivity", 34855, 3), new C13534l("OECF", 34856, 7), new C13534l("SensitivityType", 34864, 3), new C13534l("StandardOutputSensitivity", 34865, 4), new C13534l("RecommendedExposureIndex", 34866, 4), new C13534l("ISOSpeed", 34867, 4), new C13534l("ISOSpeedLatitudeyyy", 34868, 4), new C13534l("ISOSpeedLatitudezzz", 34869, 4), new C13534l("ExifVersion", 36864, 2), new C13534l("DateTimeOriginal", 36867, 2), new C13534l("DateTimeDigitized", 36868, 2), new C13534l("OffsetTime", 36880, 2), new C13534l("OffsetTimeOriginal", 36881, 2), new C13534l("OffsetTimeDigitized", 36882, 2), new C13534l("ComponentsConfiguration", 37121, 7), new C13534l("CompressedBitsPerPixel", 37122, 5), new C13534l("ShutterSpeedValue", 37377, 10), new C13534l("ApertureValue", 37378, 5), new C13534l("BrightnessValue", 37379, 10), new C13534l("ExposureBiasValue", 37380, 10), new C13534l("MaxApertureValue", 37381, 5), new C13534l("SubjectDistance", 37382, 5), new C13534l("MeteringMode", 37383, 3), new C13534l("LightSource", 37384, 3), new C13534l("Flash", 37385, 3), new C13534l("FocalLength", 37386, 5), new C13534l("SubjectArea", 37396, 3), new C13534l("MakerNote", 37500, 7), new C13534l("UserComment", 37510, 7), new C13534l("SubSecTime", 37520, 2), new C13534l("SubSecTimeOriginal", 37521, 2), new C13534l("SubSecTimeDigitized", 37522, 2), new C13534l("FlashpixVersion", 40960, 7), new C13534l("ColorSpace", 40961, 3), new C13534l(40962, 3, 4, "PixelXDimension"), new C13534l(40963, 3, 4, "PixelYDimension"), new C13534l("RelatedSoundFile", 40964, 2), new C13534l("InteroperabilityIFDPointer", 40965, 4), new C13534l("FlashEnergy", 41483, 5), new C13534l("SpatialFrequencyResponse", 41484, 7), new C13534l("FocalPlaneXResolution", 41486, 5), new C13534l("FocalPlaneYResolution", 41487, 5), new C13534l("FocalPlaneResolutionUnit", 41488, 3), new C13534l("SubjectLocation", 41492, 3), new C13534l("ExposureIndex", 41493, 5), new C13534l("SensingMethod", 41495, 3), new C13534l("FileSource", 41728, 7), new C13534l("SceneType", 41729, 7), new C13534l("CFAPattern", 41730, 7), new C13534l("CustomRendered", 41985, 3), new C13534l("ExposureMode", 41986, 3), new C13534l("WhiteBalance", 41987, 3), new C13534l("DigitalZoomRatio", 41988, 5), new C13534l("FocalLengthIn35mmFilm", 41989, 3), new C13534l("SceneCaptureType", 41990, 3), new C13534l("GainControl", 41991, 3), new C13534l("Contrast", 41992, 3), new C13534l("Saturation", 41993, 3), new C13534l("Sharpness", 41994, 3), new C13534l("DeviceSettingDescription", 41995, 7), new C13534l("SubjectDistanceRange", 41996, 3), new C13534l("ImageUniqueID", 42016, 2), new C13534l("CameraOwnerName", 42032, 2), new C13534l("BodySerialNumber", 42033, 2), new C13534l("LensSpecification", 42034, 5), new C13534l("LensMake", 42035, 2), new C13534l("LensModel", 42036, 2), new C13534l("Gamma", 42240, 5), new C13534l("DNGVersion", 50706, 1), new C13534l(50720, 3, 4, "DefaultCropSize")};
        C13534l[] c13534lArr3 = {new C13534l("GPSVersionID", 0, 1), new C13534l("GPSLatitudeRef", 1, 2), new C13534l(2, 5, 10, "GPSLatitude"), new C13534l("GPSLongitudeRef", 3, 2), new C13534l(4, 5, 10, "GPSLongitude"), new C13534l("GPSAltitudeRef", 5, 1), new C13534l("GPSAltitude", 6, 5), new C13534l("GPSTimeStamp", 7, 5), new C13534l("GPSSatellites", 8, 2), new C13534l("GPSStatus", 9, 2), new C13534l("GPSMeasureMode", 10, 2), new C13534l("GPSDOP", 11, 5), new C13534l("GPSSpeedRef", 12, 2), new C13534l("GPSSpeed", 13, 5), new C13534l("GPSTrackRef", 14, 2), new C13534l("GPSTrack", 15, 5), new C13534l("GPSImgDirectionRef", 16, 2), new C13534l("GPSImgDirection", 17, 5), new C13534l("GPSMapDatum", 18, 2), new C13534l("GPSDestLatitudeRef", 19, 2), new C13534l("GPSDestLatitude", 20, 5), new C13534l("GPSDestLongitudeRef", 21, 2), new C13534l("GPSDestLongitude", 22, 5), new C13534l("GPSDestBearingRef", 23, 2), new C13534l("GPSDestBearing", 24, 5), new C13534l("GPSDestDistanceRef", 25, 2), new C13534l("GPSDestDistance", 26, 5), new C13534l("GPSProcessingMethod", 27, 7), new C13534l("GPSAreaInformation", 28, 7), new C13534l("GPSDateStamp", 29, 2), new C13534l("GPSDifferential", 30, 3), new C13534l("GPSHPositioningError", 31, 5)};
        C13534l[] c13534lArr4 = {new C13534l("InteroperabilityIndex", 1, 2)};
        C13534l[] c13534lArr5 = {new C13534l("NewSubfileType", 254, 4), new C13534l("SubfileType", 255, 4), new C13534l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, 4, "ThumbnailImageWidth"), new C13534l(257, 3, 4, "ThumbnailImageLength"), new C13534l("BitsPerSample", 258, 3), new C13534l("Compression", 259, 3), new C13534l("PhotometricInterpretation", 262, 3), new C13534l("ImageDescription", 270, 2), new C13534l("Make", 271, 2), new C13534l("Model", 272, 2), new C13534l(273, 3, 4, "StripOffsets"), new C13534l("ThumbnailOrientation", 274, 3), new C13534l("SamplesPerPixel", 277, 3), new C13534l(278, 3, 4, "RowsPerStrip"), new C13534l(279, 3, 4, "StripByteCounts"), new C13534l("XResolution", 282, 5), new C13534l("YResolution", 283, 5), new C13534l("PlanarConfiguration", 284, 3), new C13534l("ResolutionUnit", 296, 3), new C13534l("TransferFunction", 301, 3), new C13534l("Software", 305, 2), new C13534l(DataTypes.OBJ_DATETIME, 306, 2), new C13534l("Artist", 315, 2), new C13534l("WhitePoint", 318, 5), new C13534l("PrimaryChromaticities", 319, 5), new C13534l("SubIFDPointer", 330, 4), new C13534l("JPEGInterchangeFormat", 513, 4), new C13534l("JPEGInterchangeFormatLength", 514, 4), new C13534l("YCbCrCoefficients", 529, 5), new C13534l("YCbCrSubSampling", 530, 3), new C13534l("YCbCrPositioning", 531, 3), new C13534l("ReferenceBlackWhite", 532, 5), new C13534l("Copyright", 33432, 2), new C13534l("ExifIFDPointer", 34665, 4), new C13534l("GPSInfoIFDPointer", 34853, 4), new C13534l("DNGVersion", 50706, 1), new C13534l(50720, 3, 4, "DefaultCropSize")};
        f34602synchronized = new C13534l("StripOffsets", 273, 3);
        f34601strictfp = new C13534l[][]{c13534lArr, c13534lArr2, c13534lArr3, c13534lArr4, c13534lArr5, c13534lArr, new C13534l[]{new C13534l("ThumbnailImage", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 7), new C13534l("CameraSettingsIFDPointer", 8224, 4), new C13534l("ImageProcessingIFDPointer", 8256, 4)}, new C13534l[]{new C13534l("PreviewImageStart", 257, 4), new C13534l("PreviewImageLength", 258, 4)}, new C13534l[]{new C13534l("AspectFrame", 4371, 3)}, new C13534l[]{new C13534l("ColorSpace", 55, 3)}};
        f34605volatile = new C13534l[]{new C13534l("SubIFDPointer", 330, 4), new C13534l("ExifIFDPointer", 34665, 4), new C13534l("GPSInfoIFDPointer", 34853, 4), new C13534l("InteroperabilityIFDPointer", 40965, 4), new C13534l("CameraSettingsIFDPointer", 8224, 1), new C13534l("ImageProcessingIFDPointer", 8256, 1)};
        f34598native = new HashMap[10];
        f34600private = new HashMap[10];
        f34596extends = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f34597for = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f34603throw = charsetForName;
        f34594catch = "Exif\u0000\u0000".getBytes(charsetForName);
        f34595else = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C13534l[][] c13534lArr6 = f34601strictfp;
            if (i >= c13534lArr6.length) {
                HashMap map = f34597for;
                C13534l[] c13534lArr7 = f34605volatile;
                map.put(Integer.valueOf(c13534lArr7[0].yandex), 5);
                map.put(Integer.valueOf(c13534lArr7[1].yandex), 1);
                map.put(Integer.valueOf(c13534lArr7[2].yandex), 2);
                map.put(Integer.valueOf(c13534lArr7[3].yandex), 3);
                map.put(Integer.valueOf(c13534lArr7[4].yandex), 7);
                map.put(Integer.valueOf(c13534lArr7[5].yandex), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f34598native[i] = new HashMap();
            f34600private[i] = new HashMap();
            for (C13534l c13534l : c13534lArr6[i]) {
                f34598native[i].put(Integer.valueOf(c13534l.yandex), c13534l);
                f34600private[i].put(c13534l.loadAd, c13534l);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00f7 A[Catch: all -> 0x0064, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:14:0x0055, B:16:0x0058, B:24:0x006f, B:25:0x007d, B:31:0x008f, B:33:0x0096, B:51:0x00c7, B:38:0x00a6, B:45:0x00b4, B:48:0x00bc, B:49:0x00c0, B:50:0x00c4, B:52:0x00d1, B:54:0x00da, B:56:0x00e0, B:58:0x00e6, B:60:0x00ec, B:65:0x00f7), top: B:75:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public C17769l(InputStream inputStream) throws IOException {
        C13534l[][] c13534lArr = f34601strictfp;
        this.billing = new HashMap[c13534lArr.length];
        this.mopub = new HashSet(c13534lArr.length);
        this.admob = ByteOrder.BIG_ENDIAN;
        this.yandex = null;
        this.purchase = false;
        boolean z = inputStream instanceof AssetManager.AssetInputStream;
        boolean z2 = metrica;
        if (z) {
            this.crashlytics = (AssetManager.AssetInputStream) inputStream;
            this.loadAd = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.crashlytics = null;
                this.loadAd = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z2) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.crashlytics = null;
                this.loadAd = null;
            }
        } else {
            this.crashlytics = null;
            this.loadAd = null;
        }
        boolean z3 = this.purchase;
        for (int i = 0; i < c13534lArr.length; i++) {
            try {
                try {
                    this.billing[i] = new HashMap();
                } catch (IOException e) {
                    e = e;
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    yandex();
                    if (!z2) {
                        return;
                    }
                } catch (UnsupportedOperationException e2) {
                    e = e2;
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    yandex();
                    if (!z2) {
                        return;
                    }
                }
            } catch (Throwable th) {
                yandex();
                if (z2) {
                    ads();
                }
                throw th;
            }
        }
        if (!z3) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.amazon = mopub(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i2 = this.amazon;
        if (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) {
            C9115l c9115l = new C9115l(inputStream);
            int i3 = this.amazon;
            if (i3 == 4) {
                billing(c9115l, 0, 0);
            } else if (i3 == 13) {
                subs(c9115l);
            } else if (i3 == 9) {
                isPro(c9115l);
            } else if (i3 == 14) {
                vip(c9115l);
            }
        } else {
            C13167l c13167l = new C13167l(inputStream);
            if (z3) {
                if (!remoteconfig(c13167l)) {
                    yandex();
                    if (!z2) {
                        return;
                    }
                }
                ads();
            }
            int i4 = this.amazon;
            if (i4 == 12 || i4 == 15) {
                purchase(c13167l, i4);
            } else if (i4 == 7) {
                admob(c13167l);
            } else if (i4 == 10) {
                smaato(c13167l);
            } else {
                firebase(c13167l);
            }
            c13167l.billing(this.isPro);
            pro(c13167l);
        }
        yandex();
        if (!z2) {
            return;
        }
        ads();
    }

    public static ByteOrder subscription(C9115l c9115l) throws IOException {
        short s = c9115l.readShort();
        boolean z = metrica;
        if (s == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            C11467l.smaato(Integer.toHexString(s), "Invalid byte order: ");
            return null;
        }
        if (z) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022b  */
    /* JADX WARN: Code duplicated, block: B:107:0x023c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0241  */
    /* JADX WARN: Code duplicated, block: B:109:0x024d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0254  */
    /* JADX WARN: Code duplicated, block: B:114:0x0272 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x02b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:131:0x0305  */
    /* JADX WARN: Code duplicated, block: B:145:0x0342  */
    /* JADX WARN: Code duplicated, block: B:172:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:70:0x016a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:73:0x0179  */
    /* JADX WARN: Code duplicated, block: B:75:0x017f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0195  */
    /* JADX WARN: Code duplicated, block: B:79:0x019e  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:82:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:92:0x0206  */
    /* JADX WARN: Code duplicated, block: B:94:0x0221  */
    /* JADX WARN: Code duplicated, block: B:96:0x0224  */
    /* JADX WARN: Code duplicated, block: B:98:0x0227  */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x02ba, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x0153, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x017f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x0206, please report this as an issue */
    public final void Signature(C13167l c13167l, int i) throws IOException {
        HashMap[] mapArr;
        int i2;
        int i3;
        long j;
        boolean z;
        int i4;
        short s;
        Integer num;
        long j2;
        String str;
        int unsignedShort;
        long j3;
        String strAds;
        int i5;
        int i6 = c13167l.f18720l;
        int i7 = c13167l.f18722l;
        Integer numValueOf = Integer.valueOf(i6);
        HashSet hashSet = this.mopub;
        hashSet.add(numValueOf);
        short s2 = c13167l.readShort();
        boolean z2 = metrica;
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s2));
        }
        if (s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            mapArr = this.billing;
            if (s3 >= s2) {
                break;
            }
            int unsignedShort2 = c13167l.readUnsignedShort();
            int unsignedShort3 = c13167l.readUnsignedShort();
            int i8 = c13167l.readInt();
            long j4 = ((long) c13167l.f18720l) + 4;
            short s4 = s2;
            C13534l c13534l = (C13534l) f34598native[i].get(Integer.valueOf(unsignedShort2));
            if (z2) {
                i2 = 3;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c13534l != null ? c13534l.loadAd : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i8)));
            } else {
                i2 = 3;
            }
            if (c13534l == null) {
                if (z2) {
                    Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
                }
                i3 = unsignedShort2;
            } else {
                if (unsignedShort3 > 0) {
                    int[] iArr = f34604throws;
                    if (unsignedShort3 >= iArr.length) {
                        i3 = unsignedShort2;
                        if (z2 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                        }
                    } else {
                        int i9 = c13534l.crashlytics;
                        if (i9 == 7 || unsignedShort3 == 7 || i9 == unsignedShort3 || (i4 = c13534l.amazon) == unsignedShort3) {
                            i3 = unsignedShort2;
                        } else {
                            i3 = unsignedShort2;
                            if (((i9 != 4 && i4 != 4) || unsignedShort3 != i2) && (((i9 != 9 && i4 != 9) || unsignedShort3 != 8) && ((i9 != 12 && i4 != 12) || unsignedShort3 != 11))) {
                                if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since data format (" + inmobi[unsignedShort3] + ") is unexpected for tag: " + c13534l.loadAd);
                                }
                            }
                        }
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i9;
                        }
                        j = ((long) iArr[unsignedShort3]) * ((long) i8);
                        if (j < 0 || j > 2147483647L) {
                            if (z2 != 0) {
                                Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i8);
                            }
                            z = false;
                            j = j;
                        } else {
                            z = true;
                        }
                    }
                } else {
                    i3 = unsignedShort2;
                    if (z2 != 0) {
                        Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                    }
                }
                if (z) {
                    s = s3;
                    if (j > 4) {
                        i5 = c13167l.readInt();
                        if (z2 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i5);
                        }
                        if (this.amazon != 7) {
                            if ("MakerNote".equals(c13534l.loadAd)) {
                                this.firebase = i5;
                            } else if (i != 6 && "ThumbnailImage".equals(c13534l.loadAd)) {
                                this.smaato = i5;
                                this.remoteconfig = i8;
                                C2598l c2598lAmazon = C2598l.amazon(6, this.admob);
                                C2598l c2598lLoadAd = C2598l.loadAd(this.smaato, this.admob);
                                C2598l c2598lLoadAd2 = C2598l.loadAd(this.remoteconfig, this.admob);
                                mapArr[4].put("Compression", c2598lAmazon);
                                mapArr[4].put("JPEGInterchangeFormat", c2598lLoadAd);
                                mapArr[4].put("JPEGInterchangeFormatLength", c2598lLoadAd2);
                            }
                        }
                        c13167l.billing(i5);
                    } else {
                        j4 = j4;
                        i8 = i8;
                        mapArr = mapArr;
                    }
                    num = (Integer) f34597for.get(Integer.valueOf(i3));
                    if (z2 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 != 4) {
                                j3 = ((long) c13167l.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                unsignedShort = c13167l.readShort();
                            } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                unsignedShort = c13167l.readInt();
                            } else {
                                j3 = -1;
                            }
                            if (z2 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j3), c13534l.loadAd));
                            }
                            if (j3 > 0 || (i7 != -1 && j3 >= i7)) {
                                if (z2 != 0) {
                                    strAds = AbstractC2812l.ads(j3, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i7 != -1) {
                                        strAds = strAds + " (total length: " + i7 + ")";
                                    }
                                    Log.d("ExifInterface", strAds);
                                }
                            } else if (!hashSet.contains(Integer.valueOf((int) j3))) {
                                c13167l.billing(j3);
                                Signature(c13167l, num.intValue());
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j3 + ")");
                            }
                            c13167l.billing(j4);
                        } else {
                            unsignedShort = c13167l.readUnsignedShort();
                        }
                        j3 = unsignedShort;
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j3), c13534l.loadAd));
                        }
                        if (j3 > 0) {
                            if (z2 != 0) {
                                strAds = AbstractC2812l.ads(j3, "Skip jump into the IFD since its offset is invalid: ");
                                if (i7 != -1) {
                                    strAds = strAds + " (total length: " + i7 + ")";
                                }
                                Log.d("ExifInterface", strAds);
                            }
                        } else if (z2 != 0) {
                            strAds = AbstractC2812l.ads(j3, "Skip jump into the IFD since its offset is invalid: ");
                            if (i7 != -1) {
                                strAds = strAds + " (total length: " + i7 + ")";
                            }
                            Log.d("ExifInterface", strAds);
                        }
                        c13167l.billing(j4);
                    } else {
                        j2 = j4;
                        int i10 = c13167l.f18720l + this.isPro;
                        byte[] bArr = new byte[(int) j];
                        c13167l.readFully(bArr);
                        C2598l c2598l = new C2598l(i10, bArr, unsignedShort3, i8);
                        HashMap map = mapArr[i];
                        str = c13534l.loadAd;
                        map.put(str, c2598l);
                        if ("DNGVersion".equals(str)) {
                            this.amazon = 3;
                        }
                        if (((!"Make".equals(str) || "Model".equals(str)) && c2598l.mopub(this.admob).contains("PENTAX")) || ("Compression".equals(str) && c2598l.billing(this.admob) == 65535)) {
                            this.amazon = 8;
                        }
                        if (c13167l.f18720l != j2) {
                            c13167l.billing(j2);
                        }
                    }
                } else {
                    c13167l.billing(j4);
                    s = s3;
                }
                s3 = (short) (s + 1);
                s2 = s4;
                z2 = z2;
            }
            z = false;
            j = 0;
            if (z) {
                c13167l.billing(j4);
                s = s3;
            } else {
                s = s3;
                if (j > 4) {
                    i5 = c13167l.readInt();
                    if (z2 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i5);
                    }
                    if (this.amazon != 7) {
                        if ("MakerNote".equals(c13534l.loadAd)) {
                            this.firebase = i5;
                        } else if (i != 6) {
                        }
                    }
                    c13167l.billing(i5);
                } else {
                    j4 = j4;
                    i8 = i8;
                    mapArr = mapArr;
                }
                num = (Integer) f34597for.get(Integer.valueOf(i3));
                if (z2 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 != 4) {
                            j3 = ((long) c13167l.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = c13167l.readInt();
                        } else {
                            unsignedShort = c13167l.readShort();
                        }
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j3), c13534l.loadAd));
                        }
                        if (j3 > 0) {
                            if (z2 != 0) {
                                strAds = AbstractC2812l.ads(j3, "Skip jump into the IFD since its offset is invalid: ");
                                if (i7 != -1) {
                                    strAds = strAds + " (total length: " + i7 + ")";
                                }
                                Log.d("ExifInterface", strAds);
                            }
                        } else if (z2 != 0) {
                            strAds = AbstractC2812l.ads(j3, "Skip jump into the IFD since its offset is invalid: ");
                            if (i7 != -1) {
                                strAds = strAds + " (total length: " + i7 + ")";
                            }
                            Log.d("ExifInterface", strAds);
                        }
                        c13167l.billing(j4);
                    } else {
                        unsignedShort = c13167l.readUnsignedShort();
                    }
                    j3 = unsignedShort;
                    if (z2 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j3), c13534l.loadAd));
                    }
                    if (j3 > 0) {
                        if (z2 != 0) {
                            strAds = AbstractC2812l.ads(j3, "Skip jump into the IFD since its offset is invalid: ");
                            if (i7 != -1) {
                                strAds = strAds + " (total length: " + i7 + ")";
                            }
                            Log.d("ExifInterface", strAds);
                        }
                    } else if (z2 != 0) {
                        strAds = AbstractC2812l.ads(j3, "Skip jump into the IFD since its offset is invalid: ");
                        if (i7 != -1) {
                            strAds = strAds + " (total length: " + i7 + ")";
                        }
                        Log.d("ExifInterface", strAds);
                    }
                    c13167l.billing(j4);
                } else {
                    j2 = j4;
                    int i11 = c13167l.f18720l + this.isPro;
                    byte[] bArr2 = new byte[(int) j];
                    c13167l.readFully(bArr2);
                    C2598l c2598l2 = new C2598l(i11, bArr2, unsignedShort3, i8);
                    HashMap map2 = mapArr[i];
                    str = c13534l.loadAd;
                    map2.put(str, c2598l2);
                    if ("DNGVersion".equals(str)) {
                        this.amazon = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.amazon = 8;
                    if (c13167l.f18720l != j2) {
                        c13167l.billing(j2);
                    }
                }
            }
            s3 = (short) (s + 1);
            s2 = s4;
            z2 = z2;
        }
        boolean z3 = z2;
        int i12 = c13167l.readInt();
        if (z3) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i12)));
        }
        long j5 = i12;
        if (j5 <= 0) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i12);
                return;
            }
            return;
        }
        if (hashSet.contains(Integer.valueOf(i12))) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i12);
                return;
            }
            return;
        }
        c13167l.billing(j5);
        if (mapArr[4].isEmpty()) {
            Signature(c13167l, 4);
        } else if (mapArr[5].isEmpty()) {
            Signature(c13167l, 5);
        }
    }

    public final void ad(int i, int i2) {
        HashMap[] mapArr = this.billing;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = metrica;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C2598l c2598l = (C2598l) mapArr[i].get("ImageLength");
        C2598l c2598l2 = (C2598l) mapArr[i].get("ImageWidth");
        C2598l c2598l3 = (C2598l) mapArr[i2].get("ImageLength");
        C2598l c2598l4 = (C2598l) mapArr[i2].get("ImageWidth");
        if (c2598l == null || c2598l2 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c2598l3 == null || c2598l4 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iBilling = c2598l.billing(this.admob);
        int iBilling2 = c2598l2.billing(this.admob);
        int iBilling3 = c2598l3.billing(this.admob);
        int iBilling4 = c2598l4.billing(this.admob);
        if (iBilling >= iBilling3 || iBilling2 >= iBilling4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void adcel(C13167l c13167l) throws IOException {
        ByteOrder byteOrderSubscription = subscription(c13167l);
        this.admob = byteOrderSubscription;
        c13167l.f18719l = byteOrderSubscription;
        int unsignedShort = c13167l.readUnsignedShort();
        int i = this.amazon;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            C11467l.smaato(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = c13167l.readInt();
        if (i2 < 8) {
            C18262l.metrica(AbstractC0653l.vip(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c13167l.yandex(i3);
        }
    }

    public final void admob(C13167l c13167l) throws IOException {
        int i;
        int i2;
        firebase(c13167l);
        HashMap[] mapArr = this.billing;
        C2598l c2598l = (C2598l) mapArr[1].get("MakerNote");
        if (c2598l != null) {
            C13167l c13167l2 = new C13167l(c2598l.amazon);
            c13167l2.f18719l = this.admob;
            byte[] bArr = ad;
            byte[] bArr2 = new byte[bArr.length];
            c13167l2.readFully(bArr2);
            c13167l2.billing(0L);
            byte[] bArr3 = advert;
            byte[] bArr4 = new byte[bArr3.length];
            c13167l2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c13167l2.billing(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c13167l2.billing(12L);
            }
            Signature(c13167l2, 6);
            C2598l c2598l2 = (C2598l) mapArr[7].get("PreviewImageStart");
            C2598l c2598l3 = (C2598l) mapArr[7].get("PreviewImageLength");
            if (c2598l2 != null && c2598l3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c2598l2);
                mapArr[5].put("JPEGInterchangeFormatLength", c2598l3);
            }
            C2598l c2598l4 = (C2598l) mapArr[8].get("AspectFrame");
            if (c2598l4 != null) {
                int[] iArr = (int[]) c2598l4.admob(this.admob);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C2598l c2598lAmazon = C2598l.amazon(i5, this.admob);
                C2598l c2598lAmazon2 = C2598l.amazon(i6, this.admob);
                mapArr[0].put("ImageWidth", c2598lAmazon);
                mapArr[0].put("ImageLength", c2598lAmazon2);
            }
        }
    }

    public final void ads() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.billing;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbSignature = AbstractC2812l.Signature("The size of tag group[", i, "]: ");
            sbSignature.append(mapArr[i].size());
            Log.d("ExifInterface", sbSignature.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C2598l c2598l = (C2598l) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c2598l.toString() + ", tagValue: '" + c2598l.mopub(this.admob) + "'");
            }
            i++;
        }
    }

    public final void advert(C13167l c13167l, int i) throws IOException {
        C2598l c2598lAmazon;
        C2598l c2598lAmazon2;
        HashMap[] mapArr = this.billing;
        C2598l c2598l = (C2598l) mapArr[i].get("DefaultCropSize");
        C2598l c2598l2 = (C2598l) mapArr[i].get("SensorTopBorder");
        C2598l c2598l3 = (C2598l) mapArr[i].get("SensorLeftBorder");
        C2598l c2598l4 = (C2598l) mapArr[i].get("SensorBottomBorder");
        C2598l c2598l5 = (C2598l) mapArr[i].get("SensorRightBorder");
        if (c2598l != null) {
            int i2 = c2598l.yandex;
            ByteOrder byteOrder = this.admob;
            if (i2 == 5) {
                C4601l[] c4601lArr = (C4601l[]) c2598l.admob(byteOrder);
                if (c4601lArr == null || c4601lArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c4601lArr));
                    return;
                } else {
                    c2598lAmazon = C2598l.crashlytics(new C4601l[]{c4601lArr[0]}, this.admob);
                    c2598lAmazon2 = C2598l.crashlytics(new C4601l[]{c4601lArr[1]}, this.admob);
                }
            } else {
                int[] iArr = (int[]) c2598l.admob(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c2598lAmazon = C2598l.amazon(iArr[0], this.admob);
                c2598lAmazon2 = C2598l.amazon(iArr[1], this.admob);
            }
            mapArr[i].put("ImageWidth", c2598lAmazon);
            mapArr[i].put("ImageLength", c2598lAmazon2);
            return;
        }
        if (c2598l2 != null && c2598l3 != null && c2598l4 != null && c2598l5 != null) {
            int iBilling = c2598l2.billing(this.admob);
            int iBilling2 = c2598l4.billing(this.admob);
            int iBilling3 = c2598l5.billing(this.admob);
            int iBilling4 = c2598l3.billing(this.admob);
            if (iBilling2 <= iBilling || iBilling3 <= iBilling4) {
                return;
            }
            C2598l c2598lAmazon3 = C2598l.amazon(iBilling2 - iBilling, this.admob);
            C2598l c2598lAmazon4 = C2598l.amazon(iBilling3 - iBilling4, this.admob);
            mapArr[i].put("ImageLength", c2598lAmazon3);
            mapArr[i].put("ImageWidth", c2598lAmazon4);
            return;
        }
        C2598l c2598l6 = (C2598l) mapArr[i].get("ImageLength");
        C2598l c2598l7 = (C2598l) mapArr[i].get("ImageWidth");
        if (c2598l6 == null || c2598l7 == null) {
            C2598l c2598l8 = (C2598l) mapArr[i].get("JPEGInterchangeFormat");
            C2598l c2598l9 = (C2598l) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c2598l8 == null || c2598l9 == null) {
                return;
            }
            int iBilling5 = c2598l8.billing(this.admob);
            int iBilling6 = c2598l8.billing(this.admob);
            c13167l.billing(iBilling5);
            byte[] bArr = new byte[iBilling6];
            c13167l.readFully(bArr);
            billing(new C9115l(bArr), iBilling5, i);
        }
    }

    public final C2598l amazon(String str) {
        C2598l c2598l;
        int i;
        C2598l c2598l2;
        if (str == null) {
            C6541l.subs("tag shouldn't be null");
            return null;
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (metrica) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.amazon) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (c2598l2 = this.vip) != null)) {
            return c2598l2;
        }
        for (int i2 = 0; i2 < f34601strictfp.length; i2++) {
            C2598l c2598l3 = (C2598l) this.billing[i2].get(str);
            if (c2598l3 != null) {
                return c2598l3;
            }
        }
        if (!"Xmp".equals(str) || (c2598l = this.vip) == null) {
            return null;
        }
        return c2598l;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00af A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[LOOP:0: B:10:0x0033->B:56:0x014b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a7. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void billing(defpackage.C9115l r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17769l.billing(lٌؙۡ, int, int):void");
    }

    public final int crashlytics(int i, String str) {
        C2598l c2598lAmazon = amazon(str);
        if (c2598lAmazon != null) {
            try {
                return c2598lAmazon.billing(this.admob);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public final void firebase(C13167l c13167l) throws IOException {
        adcel(c13167l);
        Signature(c13167l, 0);
        advert(c13167l, 0);
        advert(c13167l, 5);
        advert(c13167l, 4);
        isVip();
        if (this.amazon == 8) {
            HashMap[] mapArr = this.billing;
            C2598l c2598l = (C2598l) mapArr[1].get("MakerNote");
            if (c2598l != null) {
                C13167l c13167l2 = new C13167l(c2598l.amazon);
                c13167l2.f18719l = this.admob;
                c13167l2.yandex(6);
                Signature(c13167l2, 9);
                C2598l c2598l2 = (C2598l) mapArr[9].get("ColorSpace");
                if (c2598l2 != null) {
                    mapArr[1].put("ColorSpace", c2598l2);
                }
            }
        }
    }

    public final void isPro(C9115l c9115l) throws IOException {
        boolean z = metrica;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c9115l);
        }
        c9115l.yandex(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c9115l.readFully(bArr);
        c9115l.readFully(bArr2);
        c9115l.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c9115l.yandex(i - c9115l.f18720l);
        c9115l.readFully(bArr4);
        billing(new C9115l(bArr4), i, 5);
        c9115l.yandex(i3 - c9115l.f18720l);
        c9115l.f18719l = ByteOrder.BIG_ENDIAN;
        int i4 = c9115l.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c9115l.readUnsignedShort();
            int unsignedShort2 = c9115l.readUnsignedShort();
            if (unsignedShort == f34602synchronized.yandex) {
                short s = c9115l.readShort();
                short s2 = c9115l.readShort();
                C2598l c2598lAmazon = C2598l.amazon(s, this.admob);
                C2598l c2598lAmazon2 = C2598l.amazon(s2, this.admob);
                HashMap[] mapArr = this.billing;
                mapArr[0].put("ImageLength", c2598lAmazon);
                mapArr[0].put("ImageWidth", c2598lAmazon2);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            c9115l.yandex(unsignedShort2);
        }
    }

    public final void isVip() {
        ad(0, 5);
        ad(0, 4);
        ad(5, 4);
        HashMap[] mapArr = this.billing;
        C2598l c2598l = (C2598l) mapArr[1].get("PixelXDimension");
        C2598l c2598l2 = (C2598l) mapArr[1].get("PixelYDimension");
        if (c2598l != null && c2598l2 != null) {
            mapArr[0].put("ImageWidth", c2598l);
            mapArr[0].put("ImageLength", c2598l2);
        }
        if (mapArr[4].isEmpty() && startapp(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!startapp(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        license("ThumbnailOrientation", 0, "Orientation");
        license("ThumbnailImageLength", 0, "ImageLength");
        license("ThumbnailImageWidth", 0, "ImageWidth");
        license("ThumbnailOrientation", 5, "Orientation");
        license("ThumbnailImageLength", 5, "ImageLength");
        license("ThumbnailImageWidth", 5, "ImageWidth");
        license("Orientation", 4, "ThumbnailOrientation");
        license("ImageLength", 4, "ThumbnailImageLength");
        license("ImageWidth", 4, "ThumbnailImageWidth");
    }

    public final void license(String str, int i, String str2) {
        HashMap[] mapArr = this.billing;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (C2598l) map.get(str));
        mapArr[i].remove(str);
    }

    public final String loadAd(String str) {
        if (str == null) {
            C6541l.subs("tag shouldn't be null");
            return null;
        }
        C2598l c2598lAmazon = amazon(str);
        if (c2598lAmazon != null) {
            int i = c2598lAmazon.yandex;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C4601l[] c4601lArr = (C4601l[]) c2598lAmazon.admob(this.admob);
                if (c4601lArr == null || c4601lArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c4601lArr));
                    return null;
                }
                C4601l c4601l = c4601lArr[0];
                Integer numValueOf = Integer.valueOf((int) (c4601l.yandex / c4601l.loadAd));
                C4601l c4601l2 = c4601lArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c4601l2.yandex / c4601l2.loadAd));
                C4601l c4601l3 = c4601lArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c4601l3.yandex / c4601l3.loadAd)));
            }
            boolean zContains = f34596extends.contains(str);
            ByteOrder byteOrder = this.admob;
            if (!zContains) {
                return c2598lAmazon.mopub(byteOrder);
            }
            try {
                return Double.toString(c2598lAmazon.purchase(byteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final void metrica(C9115l c9115l, HashMap map) throws IOException {
        C2598l c2598l = (C2598l) map.get("JPEGInterchangeFormat");
        C2598l c2598l2 = (C2598l) map.get("JPEGInterchangeFormatLength");
        if (c2598l == null || c2598l2 == null) {
            return;
        }
        int iBilling = c2598l.billing(this.admob);
        int iBilling2 = c2598l2.billing(this.admob);
        if (this.amazon == 7) {
            iBilling += this.firebase;
        }
        if (iBilling > 0 && iBilling2 > 0 && this.yandex == null && this.crashlytics == null && this.loadAd == null) {
            c9115l.yandex(iBilling);
            c9115l.readFully(new byte[iBilling2]);
        }
        if (metrica) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iBilling + ", length: " + iBilling2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x01ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:149:0x01ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:151:0x01b1  */
    public final int mopub(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        C9115l c9115l;
        int i2;
        C9115l c9115l2;
        int i3;
        int i4;
        int i5;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i6 = 0;
        while (true) {
            byte[] bArr2 = ads;
            if (i6 >= bArr2.length) {
                return 4;
            }
            if (bArr[i6] != bArr2[i6]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i7 = 0; i7 < bytes.length; i7++) {
                    if (bArr[i7] != bytes[i7]) {
                        C9115l c9115l3 = null;
                        int i8 = 1;
                        try {
                            c9115l = new C9115l(bArr);
                            try {
                                try {
                                    long j2 = c9115l.readInt();
                                    byte[] bArr3 = new byte[4];
                                    c9115l.readFully(bArr3);
                                    if (Arrays.equals(bArr3, subscription)) {
                                        if (j2 == 1) {
                                            j2 = c9115l.readLong();
                                            j = 16;
                                            if (j2 < 16) {
                                            }
                                            c9115l.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            j = 8;
                                        }
                                        if (j2 > 5000) {
                                            j2 = 5000;
                                        }
                                        long j3 = j2 - j;
                                        if (j3 < 8) {
                                            c9115l.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            byte[] bArr4 = new byte[4];
                                            long j4 = 0;
                                            boolean z = false;
                                            boolean z2 = false;
                                            boolean z3 = false;
                                            while (true) {
                                                if (j4 < j3 / 4) {
                                                    try {
                                                        c9115l.readFully(bArr4);
                                                        if (j4 != 1) {
                                                            i = 0;
                                                            try {
                                                                if (Arrays.equals(bArr4, tapsense)) {
                                                                    z = true;
                                                                } else if (Arrays.equals(bArr4, Signature)) {
                                                                    z2 = true;
                                                                } else if (Arrays.equals(bArr4, license) || Arrays.equals(bArr4, pro)) {
                                                                    z3 = true;
                                                                }
                                                                if (!z) {
                                                                    continue;
                                                                } else if (z2) {
                                                                    c9115l.close();
                                                                    i2 = 12;
                                                                } else if (z3) {
                                                                    c9115l.close();
                                                                    i2 = 15;
                                                                }
                                                            } catch (Exception e) {
                                                                e = e;
                                                                if (metrica) {
                                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                                }
                                                                if (c9115l != null) {
                                                                    c9115l.close();
                                                                }
                                                                i2 = i;
                                                            }
                                                        }
                                                        j4++;
                                                    } catch (EOFException unused) {
                                                        i = 0;
                                                        c9115l.close();
                                                        i2 = i;
                                                    }
                                                } else {
                                                    i = 0;
                                                }
                                                c9115l.close();
                                                i2 = i;
                                            }
                                        }
                                    } else {
                                        c9115l.close();
                                        i = 0;
                                        i2 = 0;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    c9115l3 = c9115l;
                                    if (c9115l3 != null) {
                                        c9115l3.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                i = 0;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i = 0;
                            c9115l = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (c9115l3 != null) {
                                c9115l3.close();
                            }
                            throw th;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        try {
                            c9115l2 = new C9115l(bArr);
                            try {
                                ByteOrder byteOrderSubscription = subscription(c9115l2);
                                this.admob = byteOrderSubscription;
                                c9115l2.f18719l = byteOrderSubscription;
                                short s = c9115l2.readShort();
                                i3 = (s == 20306 || s == 21330) ? 1 : i;
                                c9115l2.close();
                            } catch (Exception unused2) {
                                if (c9115l2 != null) {
                                    c9115l2.close();
                                }
                                i3 = i;
                            } catch (Throwable th3) {
                                th = th3;
                                c9115l3 = c9115l2;
                                if (c9115l3 != null) {
                                    c9115l3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused3) {
                            c9115l2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        if (i3 != 0) {
                            return 7;
                        }
                        try {
                            C9115l c9115l4 = new C9115l(bArr);
                            try {
                                ByteOrder byteOrderSubscription2 = subscription(c9115l4);
                                this.admob = byteOrderSubscription2;
                                c9115l4.f18719l = byteOrderSubscription2;
                                i4 = c9115l4.readShort() == 85 ? 1 : i;
                                c9115l4.close();
                            } catch (Exception unused4) {
                                c9115l3 = c9115l4;
                                if (c9115l3 != null) {
                                    c9115l3.close();
                                }
                                i4 = i;
                            } catch (Throwable th5) {
                                th = th5;
                                c9115l3 = c9115l4;
                                if (c9115l3 != null) {
                                    c9115l3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused5) {
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i4 != 0) {
                            return 10;
                        }
                        int i9 = i;
                        while (true) {
                            byte[] bArr5 = isVip;
                            if (i9 >= bArr5.length) {
                                i5 = 1;
                                break;
                            }
                            if (bArr[i9] != bArr5[i9]) {
                                i5 = i;
                                break;
                            }
                            i9++;
                        }
                        if (i5 != 0) {
                            return 13;
                        }
                        int i10 = i;
                        while (true) {
                            byte[] bArr6 = premium;
                            if (i10 >= bArr6.length) {
                                int i11 = i;
                                while (true) {
                                    byte[] bArr7 = applovin;
                                    if (i11 >= bArr7.length) {
                                        break;
                                    }
                                    if (bArr[bArr6.length + i11 + 4] != bArr7[i11]) {
                                        break;
                                    }
                                    i11++;
                                }
                                if (i8 != 0) {
                                    return 14;
                                }
                                return i;
                            }
                            if (bArr[i10] != bArr6[i10]) {
                                break;
                            }
                            i10++;
                        }
                        i8 = i;
                        if (i8 != 0) {
                            return 14;
                        }
                        return i;
                    }
                }
                return 9;
            }
            i6++;
        }
    }

    public final void pro(C9115l c9115l) throws IOException {
        C2598l c2598l;
        int iBilling;
        HashMap map = this.billing[4];
        C2598l c2598l2 = (C2598l) map.get("Compression");
        if (c2598l2 == null) {
            metrica(c9115l, map);
            return;
        }
        int iBilling2 = c2598l2.billing(this.admob);
        if (iBilling2 != 1) {
            if (iBilling2 == 6) {
                metrica(c9115l, map);
                return;
            } else if (iBilling2 != 7) {
                return;
            }
        }
        C2598l c2598l3 = (C2598l) map.get("BitsPerSample");
        if (c2598l3 != null) {
            int[] iArr = (int[]) c2598l3.admob(this.admob);
            int[] iArr2 = startapp;
            if (Arrays.equals(iArr2, iArr) || (this.amazon == 3 && (c2598l = (C2598l) map.get("PhotometricInterpretation")) != null && (((iBilling = c2598l.billing(this.admob)) == 1 && Arrays.equals(iArr, adcel)) || (iBilling == 6 && Arrays.equals(iArr, iArr2))))) {
                C2598l c2598l4 = (C2598l) map.get("StripOffsets");
                C2598l c2598l5 = (C2598l) map.get("StripByteCounts");
                if (c2598l4 == null || c2598l5 == null) {
                    return;
                }
                long[] jArrLoadAd = AbstractC8853l.loadAd(c2598l4.admob(this.admob));
                long[] jArrLoadAd2 = AbstractC8853l.loadAd(c2598l5.admob(this.admob));
                if (jArrLoadAd == null || jArrLoadAd.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrLoadAd2 == null || jArrLoadAd2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrLoadAd.length != jArrLoadAd2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrLoadAd2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.subs = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrLoadAd.length; i3++) {
                    int i4 = (int) jArrLoadAd[i3];
                    int i5 = (int) jArrLoadAd2[i3];
                    if (i3 < jArrLoadAd.length - 1 && i4 + i5 != jArrLoadAd[i3 + 1]) {
                        this.subs = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        c9115l.yandex(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            c9115l.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.subs) {
                    long j3 = jArrLoadAd[0];
                    return;
                }
                return;
            }
        }
        if (metrica) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void purchase(C13167l c13167l, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            C10754l.ads("Reading EXIF from HEIC files is supported from SDK 28 and above");
            return;
        }
        if (i == 15 && i3 < 31) {
            C10754l.ads("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new C9469l(c13167l));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.billing;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C2598l.amazon(Integer.parseInt(strExtractMetadata), this.admob));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", C2598l.amazon(Integer.parseInt(strExtractMetadata3), this.admob));
                }
                if (strExtractMetadata2 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata2);
                    if (i4 == 90) {
                        i2 = 6;
                    } else if (i4 != 180) {
                        i2 = i4 != 270 ? 1 : 8;
                    } else {
                        i2 = 3;
                    }
                    mapArr[0].put("Orientation", C2598l.amazon(i2, this.admob));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c13167l.billing(i5);
                    byte[] bArr = new byte[6];
                    c13167l.readFully(bArr);
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, f34594catch)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    c13167l.readFully(bArr2);
                    this.isPro = i7;
                    tapsense(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata8);
                    int i10 = Integer.parseInt(strExtractMetadata9);
                    long j = i9;
                    c13167l.billing(j);
                    byte[] bArr3 = new byte[i10];
                    c13167l.readFully(bArr3);
                    this.vip = new C2598l(j, bArr3, 1, i10);
                }
                if (metrica) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
                throw th;
            } catch (IOException unused2) {
                throw th;
            }
        }
    }

    public final boolean remoteconfig(C13167l c13167l) throws IOException {
        byte[] bArr = f34594catch;
        byte[] bArr2 = new byte[bArr.length];
        c13167l.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrCopyOf = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i2 = c13167l.f18721l.read(bArrCopyOf, i, bArrCopyOf.length - i);
            if (i2 == -1) {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
                this.isPro = bArr.length;
                tapsense(0, bArrCopyOf2);
                return true;
            }
            i += i2;
            c13167l.f18720l += i2;
        }
    }

    public final void smaato(C13167l c13167l) throws IOException {
        if (metrica) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c13167l);
        }
        firebase(c13167l);
        HashMap[] mapArr = this.billing;
        C2598l c2598l = (C2598l) mapArr[0].get("JpgFromRaw");
        if (c2598l != null) {
            billing(new C9115l(c2598l.amazon), (int) c2598l.crashlytics, 5);
        }
        C2598l c2598l2 = (C2598l) mapArr[0].get("ISO");
        C2598l c2598l3 = (C2598l) mapArr[1].get("PhotographicSensitivity");
        if (c2598l2 == null || c2598l3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c2598l2);
    }

    public final boolean startapp(HashMap map) {
        C2598l c2598l = (C2598l) map.get("ImageLength");
        C2598l c2598l2 = (C2598l) map.get("ImageWidth");
        if (c2598l == null || c2598l2 == null) {
            return false;
        }
        return c2598l.billing(this.admob) <= 512 && c2598l2.billing(this.admob) <= 512;
    }

    public final void subs(C9115l c9115l) throws IOException {
        if (metrica) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c9115l);
        }
        c9115l.f18719l = ByteOrder.BIG_ENDIAN;
        int i = c9115l.f18720l;
        c9115l.yandex(isVip.length);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (z && z2) {
                return;
            }
            try {
                int i2 = c9115l.readInt();
                int i3 = c9115l.readInt();
                int i4 = c9115l.f18720l;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    return;
                }
                if (i3 == 1700284774 && !z) {
                    this.isPro = i6;
                    byte[] bArr = new byte[i2];
                    c9115l.readFully(bArr);
                    int i7 = c9115l.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    tapsense(0, bArr);
                    isVip();
                    pro(new C9115l(bArr));
                    z = true;
                } else if (i3 == 1767135348 && !z2) {
                    byte[] bArr2 = signatures;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        c9115l.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = c9115l.f18720l - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            c9115l.readFully(bArr4);
                            this.vip = new C2598l(i8, bArr4, 1, i9);
                            z2 = true;
                        }
                    }
                }
                c9115l.yandex(i5 - c9115l.f18720l);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    public final void tapsense(int i, byte[] bArr) throws IOException {
        C13167l c13167l = new C13167l(bArr);
        adcel(c13167l);
        Signature(c13167l, i);
    }

    public final void vip(C9115l c9115l) throws IOException {
        if (metrica) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c9115l);
        }
        c9115l.f18719l = ByteOrder.LITTLE_ENDIAN;
        c9115l.yandex(premium.length);
        int i = c9115l.readInt() + 8;
        byte[] bArr = applovin;
        c9115l.yandex(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c9115l.readFully(bArr2);
                int i2 = c9115l.readInt();
                int i3 = length + 8;
                if (Arrays.equals(appmetrica, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    c9115l.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f34594catch;
                    if (AbstractC8853l.billing(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.isPro = i3;
                    tapsense(0, bArrCopyOfRange);
                    pro(new C9115l(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c9115l.yandex(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void yandex() {
        String strLoadAd = loadAd("DateTimeOriginal");
        HashMap[] mapArr = this.billing;
        if (strLoadAd != null && loadAd(DataTypes.OBJ_DATETIME) == null) {
            mapArr[0].put(DataTypes.OBJ_DATETIME, C2598l.yandex(strLoadAd));
        }
        if (loadAd("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C2598l.loadAd(0L, this.admob));
        }
        if (loadAd("ImageLength") == null) {
            mapArr[0].put("ImageLength", C2598l.loadAd(0L, this.admob));
        }
        if (loadAd("Orientation") == null) {
            mapArr[0].put("Orientation", C2598l.loadAd(0L, this.admob));
        }
        if (loadAd("LightSource") == null) {
            mapArr[1].put("LightSource", C2598l.loadAd(0L, this.admob));
        }
    }
}
