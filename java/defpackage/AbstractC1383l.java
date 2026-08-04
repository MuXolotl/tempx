package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؒ۠ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1383l {
    public static final C15578l yandex = new C15578l(1018081763, false, new C10673l(18));
    public static final C15578l loadAd = new C15578l(-1666391907, false, new C17304l(7));
    public static final C15578l crashlytics = new C15578l(-1363504516, false, new C17304l(14));
    public static final C15578l amazon = new C15578l(-416367225, false, new C17304l(19));
    public static final C15578l purchase = new C15578l(463872688, false, new C17304l(24));
    public static final C15578l billing = new C15578l(-103039345, false, new C17304l(25));
    public static final C15578l mopub = new C15578l(-669951378, false, new C17304l(26));
    public static final C15578l admob = new C15578l(-1395043317, false, new C17304l(27));
    public static final C15578l subs = new C15578l(161204826, false, new C10721l(2));
    public static final C15578l isPro = new C15578l(-1804781928, false, new C10721l(3));
    public static final C15578l firebase = new C15578l(1657352852, false, new C17304l(12));
    public static final C15578l smaato = new C15578l(674359475, false, new C17304l(17));
    public static final C15578l remoteconfig = new C15578l(354136027, false, new C10721l(1));
    public static final C15578l vip = new C15578l(-1611850727, false, new C10721l(4));
    public static final C15578l metrica = new C15578l(1850284053, false, new C17304l(28));
    public static final C15578l startapp = new C15578l(867290676, false, new C17304l(29));
    public static final C15578l adcel = new C15578l(-115702701, false, new C7614l(0));
    public static final C15578l ads = new C15578l(-911498401, false, new C7614l(1));
    public static final C15578l subscription = new C15578l(774481088, false, new C7614l(2));
    public static final C15578l tapsense = new C15578l(1911829074, false, new C17304l(6));
    public static final C15578l Signature = new C15578l(-2086568529, false, new C17304l(8));
    public static final C15578l license = new C15578l(875599566, false, new C17304l(9));
    public static final C15578l pro = new C15578l(1338399247, false, new C10673l(19));
    public static final C15578l ad = new C15578l(-1413864560, false, new C17304l(10));
    public static final C15578l advert = new C15578l(-929227729, false, new C17304l(11));
    public static final C15578l isVip = new C15578l(-1502657556, false, new C10673l(20));
    public static final C15578l signatures = new C15578l(-1018020725, false, new C10673l(21));
    public static final C15578l premium = new C15578l(-533383894, false, new C10673l(22));
    public static final C15578l applovin = new C15578l(-48747063, false, new C10673l(23));
    public static final C15578l appmetrica = new C15578l(1493956426, false, new C17304l(13));
    public static final C15578l inmobi = new C15578l(1790526119, false, new C17304l(15));

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static final C15578l f3544throws = new C15578l(-1870043794, false, new C10673l(24));

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static final C15578l f3539package = new C15578l(1349888363, false, new C17304l(16));

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final C15578l f3542synchronized = new C15578l(-900770132, false, new C10673l(25));

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static final C15578l f3541strictfp = new C15578l(-416133301, false, new C10673l(26));

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static final C15578l f3545volatile = new C15578l(68503530, false, new C10673l(27));

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static final C15578l f3538native = new C15578l(553140361, false, new C10673l(28));

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static final C15578l f3540private = new C15578l(1037777192, false, new C10673l(29));

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static final C15578l f3536extends = new C15578l(1522414023, false, new C10721l(0));

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static final C15578l f3537for = new C15578l(-1789361401, false, new C17304l(18));

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static final C15578l f3543throw = new C15578l(1362163967, false, new C17304l(20));

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final C15578l f3534catch = new C15578l(107733627, false, new C17304l(21));

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static final C15578l f3535else = new C15578l(119289704, false, new C17304l(22));

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static final C15578l f3533case = new C15578l(1497543140, false, new C17304l(23));

    public static int amazon(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        C18262l.metrica(AbstractC12589l.premium(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    public static final void billing(InterfaceC14189l interfaceC14189l, Function1 function1) throws EOFException {
        C18476l c18476lCrashlytics = interfaceC14189l.crashlytics();
        if (c18476lCrashlytics.subs()) {
            C8339l.metrica("Buffer is empty");
            return;
        }
        C2139l c2139l = c18476lCrashlytics.f36081l;
        byte[] bArr = c2139l.yandex;
        int i = c2139l.loadAd;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, c2139l.crashlytics - i);
        function1.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i;
        if (iPosition != 0) {
            if (iPosition < 0) {
                C8339l.smaato("Returned negative read bytes count");
            } else if (iPosition <= c2139l.loadAd()) {
                c18476lCrashlytics.skip(iPosition);
            } else {
                C8339l.smaato("Returned too many bytes");
            }
        }
    }

    public static File crashlytics(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static boolean loadAd(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static ArrayList mopub(Iterable iterable) {
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10507l(AbstractC0441l.admob().yandex(), (AbstractC18643l) it.next()));
        }
        return arrayList;
    }

    public static MappedByteBuffer purchase(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static boolean yandex(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zLoadAd = loadAd(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zLoadAd;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }
}
