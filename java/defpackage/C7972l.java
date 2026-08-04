package defpackage;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import androidx.car.app.model.Alert;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NotificationCallback;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lًْۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C7972l implements InterfaceC17729l, InterfaceC17325l, InterfaceC17020l, InterfaceC12575l, NotificationCallback, InterfaceC0208l, InterfaceC6684l, InterfaceC4852l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C2304l f16630l = new C2304l(1);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f16631l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16632l;

    public C7972l(int i) {
        InterfaceC3858l interfaceC3858l;
        this.f16632l = i;
        switch (i) {
            case 3:
                this.f16631l = new AtomicBoolean(false);
                break;
            case 5:
                this.f16631l = C14054l.f27396l;
                break;
            case 9:
                this.f16631l = new C10127l(AbstractC7310l.yandex);
                break;
            case 12:
                this.f16631l = null;
                break;
            default:
                C10738l c10738l = C10738l.crashlytics;
                try {
                    interfaceC3858l = (InterfaceC3858l) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC3858l = f16630l;
                }
                InterfaceC3858l[] interfaceC3858lArr = {C2304l.loadAd, interfaceC3858l};
                C3200l c3200l = new C3200l();
                c3200l.yandex = interfaceC3858lArr;
                Charset charset = AbstractC6320l.yandex;
                this.f16631l = c3200l;
                break;
        }
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static int m2214extends(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public static int m2215final(C10685l c10685l, int i, int i2, byte[] bArr, int i3) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i5 + 3;
            if (i6 > i3) {
                break;
            }
            short s = (short) (bArr[i5] & 255);
            short s2 = (short) (bArr[i5 + 1] & 255);
            short s3 = (short) ((s | (s2 << 8)) & 4095);
            short s4 = (short) (((((short) (bArr[i5 + 2] & 255)) << 4) | (s2 >> 4)) & 4095);
            if (s3 < 3329) {
                ((short[]) c10685l.f21690l)[i + i4] = s3;
                i4++;
            }
            if (i4 < i2 && s4 < 3329) {
                ((short[]) c10685l.f21690l)[i + i4] = s4;
                i4++;
            }
            i5 = i6;
        }
        return i4;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static int m2216for(int i, boolean z) {
        return m2214extends(i) + (z ? 1 : 0) + i;
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static C7972l m2217static(int i) {
        return new C7972l(24, C0346l.yandex(AbstractC14640l.yandex(i)));
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static String m2218synchronized(String str, EnumC13563l enumC13563l, boolean z) {
        String strConcat = enumC13563l.f26579l;
        if (z) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return AbstractC15560l.Signature("lottie_cache_", strReplaceAll, strConcat);
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static int m2219throw(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public void m2220abstract(int i) throws IOException {
        if (i < 128) {
            m2243super(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                m2232import(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    @Override // defpackage.InterfaceC12575l
    public SecureRandom adcel() {
        return SecureRandom.getInstance("DEFAULT", (Provider) this.f16631l);
    }

    @Override // defpackage.InterfaceC17325l
    public Iterable admob(Object obj) {
        C11410l c11410l = (C11410l) this.f16631l;
        Collection collectionYandex = ((InterfaceC17477l) obj).metrica().yandex();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionYandex.iterator();
        while (it.hasNext()) {
            InterfaceC15234l interfaceC15234lPro = ((AbstractC18041l) it.next()).mo1339native().pro();
            InterfaceC17477l interfaceC17477lYandex = null;
            InterfaceC15234l interfaceC15234lLoadAd = interfaceC15234lPro != null ? interfaceC15234lPro.mo864l() : null;
            InterfaceC17477l interfaceC17477l = interfaceC15234lLoadAd instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lLoadAd : null;
            if (interfaceC17477l != null && (interfaceC17477lYandex = c11410l.yandex(interfaceC17477l)) == null) {
                interfaceC17477lYandex = interfaceC17477l;
            }
            if (interfaceC17477lYandex != null) {
                arrayList.add(interfaceC17477lYandex);
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC6684l
    public C10227l ads() {
        C10227l c10227lAdmob = AbstractC14055l.admob();
        AudioPlaylist audioPlaylist = (AudioPlaylist) this.f16631l;
        c10227lAdmob.add(new C12885l(audioPlaylist.mopub, 2, AbstractC14770l.vip(audioPlaylist)));
        return AbstractC14055l.purchase(c10227lAdmob);
    }

    @Override // defpackage.InterfaceC12575l
    public AlgorithmParameters advert(String str) {
        return AlgorithmParameters.getInstance(str, (Provider) this.f16631l);
    }

    public void appmetrica(C3654l c3654l) {
        if (!c3654l.m1386native()) {
            AbstractC0081l.crashlytics("DepthSortedSet.add called on an unattached node");
        }
        ((C10127l) this.f16631l).add(c3654l);
    }

    @Override // defpackage.InterfaceC4852l
    public Function0 billing(AbstractC15391l abstractC15391l) {
        AbstractC6475l abstractC6475l = (AbstractC6475l) this.f16631l;
        if (((C5268l) abstractC6475l).subs.compareTo(EnumC8981l.f18522l) <= 0) {
            C6541l.isPro("Cannot configure ", abstractC15391l, " to disposeComposition at Lifecycle ON_DESTROY: ", abstractC6475l, "is already destroyed");
            return null;
        }
        C15356l c15356l = new C15356l(1, abstractC15391l);
        abstractC6475l.yandex(c15356l);
        return new C4307l(abstractC6475l, c15356l, 13);
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public void m2221break(String str) throws IOException {
        ((OutputStreamWriter) this.f16631l).write(AbstractC12900l.firebase(str, "\n"));
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC4884l build() {
        return (C4010l) this.f16631l;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public Size[] mo2222case(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f16631l;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public Integer[] mo2223catch() {
        int[] outputFormats;
        Integer[] numArr = null;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f16631l;
            outputFormats = streamConfigurationMap != null ? streamConfigurationMap.getOutputFormats() : null;
        } catch (IllegalArgumentException e) {
            AbstractC5088l.Signature("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
        } catch (NullPointerException e2) {
            AbstractC5088l.Signature("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e2);
        }
        if (outputFormats != null) {
            numArr = new Integer[outputFormats.length];
            int length = outputFormats.length;
            for (int i = 0; i < length; i++) {
                numArr[i] = Integer.valueOf(outputFormats[i]);
            }
        }
        return numArr;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public File m2224class() {
        File file = new File(((C6012l) this.f16631l).f12764l.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public void m2225const(String str, String str2) throws IOException {
        m2221break("#" + str + ":" + str2);
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public void m2226continue(C7644l c7644l, Thread thread, Throwable th) {
        C17503l c17503l = (C17503l) this.f16631l;
        synchronized (c17503l) {
            try {
                String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                AbstractC7798l.amazon();
                try {
                    AbstractC14730l.yandex(((ExecutorC4850l) c17503l.purchase.f1958l).loadAd(new CallableC12781l(c17503l, System.currentTimeMillis(), th, thread, c7644l)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC12575l
    public MessageDigest crashlytics(String str) {
        return MessageDigest.getInstance(str, (Provider) this.f16631l);
    }

    @Override // defpackage.InterfaceC12575l
    public Signature createSignature(String str) {
        return Signature.getInstance(str, (Provider) this.f16631l);
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public void m2227default() {
        int i = 0;
        while (true) {
            C18449l[] c18449lArr = (C18449l[]) this.f16631l;
            if (i >= c18449lArr.length) {
                return;
            }
            C18449l c18449l = c18449lArr[i];
            for (int i2 = 0; i2 < 256; i2++) {
                int[] iArr = (int[]) c18449l.f36010l;
                int i3 = iArr[i2];
                iArr[i2] = i3 - (((4194304 + i3) >> 23) * 8380417);
            }
            c18449l.getClass();
            i++;
        }
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public long mo2228else(int i, Size size) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f16631l;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputMinFrameDuration(i, size);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public void m2229finally(boolean z, int i, applovin[] applovinVarArr) throws IOException {
        m2248try(i, z);
        m2243super(128);
        mo2233instanceof(applovinVarArr);
        m2243super(0);
        m2243super(0);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[LOOP:0: B:22:0x004e->B:34:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0096 A[EDGE_INSN: B:53:0x0096->B:35:0x0096 BREAK  A[LOOP:0: B:22:0x004e->B:34:0x0093], SYNTHETIC] */
    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public Object m2230goto(InterfaceC14592l interfaceC14592l, Function0 function0) {
        C16859l c16859l;
        InterfaceC0389l interfaceC0389l;
        if (((AbstractC1679l) this.f16631l) == null) {
            AbstractC5363l.loadAd("Called runAndWatch on a manager that has been disposed of");
        }
        AbstractC1679l abstractC1679l = (AbstractC1679l) this.f16631l;
        if ((abstractC1679l instanceof C16859l) && (interfaceC0389l = (c16859l = (C16859l) abstractC1679l).billing) != null && !interfaceC0389l.equals(interfaceC14592l)) {
            C11265l c11265l = new C11265l();
            InterfaceC0389l interfaceC0389l2 = c16859l.billing;
            if (interfaceC0389l2 == null) {
                AbstractC5363l.loadAd("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            C6295l c6295l = c16859l.amazon;
            ArrayList arrayList = c11265l.crashlytics;
            if (c6295l != null) {
                Object[] objArr = c6295l.loadAd;
                long[] jArr = c6295l.yandex;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8;
                            int i3 = 8 - ((~(i - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j & 255) < 128) {
                                    arrayList.add(new C5564l(interfaceC0389l2, objArr[(i << 3) + i4]));
                                }
                                j >>= i2;
                                i4++;
                                i2 = i2;
                            }
                            if (i3 != i2) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                arrayList.add(new C5564l(interfaceC0389l2, c16859l.loadAd));
            }
            c11265l.loadAd();
            c16859l.crashlytics();
            this.f16631l = c11265l;
        }
        AbstractC1679l abstractC1679l2 = (AbstractC1679l) this.f16631l;
        AbstractC18620l abstractC18620lSignature = AbstractC9620l.isPro().Signature(abstractC1679l2.amazon(interfaceC14592l));
        abstractC1679l2.yandex(interfaceC14592l);
        try {
            AbstractC18620l abstractC18620lIsPro = abstractC18620lSignature.isPro();
            try {
                Object objInvoke = function0.invoke();
                AbstractC18620l.adcel(abstractC18620lIsPro);
                abstractC18620lSignature.crashlytics();
                abstractC1679l2.loadAd();
                return objInvoke;
            } catch (Throwable th) {
                AbstractC18620l.adcel(abstractC18620lIsPro);
                throw th;
            }
        } catch (Throwable th2) {
            abstractC18620lSignature.crashlytics();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public void m2231implements(String str) throws IOException {
        m2221break("#" + str);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public void m2232import(byte[] bArr, int i, int i2) throws IOException {
        ((OutputStream) this.f16631l).write(bArr, i, i2);
    }

    public void inmobi() {
        int i = 0;
        while (true) {
            C18449l[] c18449lArr = (C18449l[]) this.f16631l;
            if (i >= c18449lArr.length) {
                return;
            }
            C18449l c18449l = c18449lArr[i];
            for (int i2 = 0; i2 < 256; i2++) {
                int[] iArr = (int[]) c18449l.f36010l;
                int i3 = iArr[i2];
                iArr[i2] = i3 + ((i3 >> 31) & 8380417);
            }
            c18449l.getClass();
            i++;
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public void mo2233instanceof(applovin[] applovinVarArr) {
        for (applovin applovinVar : applovinVarArr) {
            applovinVar.billing().metrica(this, true);
        }
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public void m2234interface(C7972l c7972l) {
        int i = 0;
        while (true) {
            C18449l[] c18449lArr = (C18449l[]) this.f16631l;
            if (i >= c18449lArr.length) {
                return;
            }
            C18449l c18449l = c18449lArr[i];
            C18449l c18449l2 = ((C18449l[]) c7972l.f16631l)[i];
            int[] iArr = (int[]) c18449l.f36010l;
            int[] iArr2 = (int[]) c18449l2.f36010l;
            for (int i2 = 0; i2 < 256; i2++) {
                int i3 = iArr[i2];
                int i4 = i3 + 4095;
                iArr[i2] = i4 >> 13;
                iArr2[i2] = i3 - (i4 & (-8192));
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC17020l
    public ByteBuffer loadAd() {
        return (ByteBuffer) this.f16631l;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public C8095l mo2235native() {
        return new C8095l(2, (OutputStream) this.f16631l);
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public boolean m2236new(C3654l c3654l) {
        if (!c3654l.m1386native()) {
            AbstractC0081l.crashlytics("DepthSortedSet.remove called on an unattached node");
        }
        return ((C10127l) this.f16631l).remove(c3654l);
    }

    @Override // io.realm.kotlin.internal.interop.NotificationCallback
    public void onChange(long j) {
        C4816l c4816l = (C4816l) this.f16631l;
        int i = AbstractC9795l.yandex;
        c4816l.mopub(new LongPointerWrapper(realmcJNI.realm_clone(j), true));
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public byte[] m2237package(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            C18262l.ads("iv is wrong size");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecYandex = AbstractC1606l.yandex(0, bArr.length, bArr);
        Cipher cipherCrashlytics = AbstractC1606l.crashlytics();
        cipherCrashlytics.init(1, (SecretKeySpec) this.f16631l, algorithmParameterSpecYandex);
        if (bArr3 != null && bArr3.length != 0) {
            cipherCrashlytics.updateAAD(bArr3);
        }
        int outputSize = cipherCrashlytics.getOutputSize(bArr2.length);
        if (outputSize > Alert.DURATION_SHOW_INDEFINITELY - i) {
            C18262l.ads("plaintext too long");
            return null;
        }
        byte[] bArr4 = new byte[i + outputSize];
        if (cipherCrashlytics.doFinal(bArr2, 0, bArr2.length, bArr4, i) == outputSize) {
            return bArr4;
        }
        C18262l.ads("not enough data written");
        return null;
    }

    @Override // defpackage.InterfaceC12575l
    public KeyFactory premium(String str) {
        return KeyFactory.getInstance(str, (Provider) this.f16631l);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public C13925l mo2238private() {
        return new C13925l(2, (OutputStream) this.f16631l);
    }

    @Override // defpackage.InterfaceC12575l
    public CertificateFactory pro(String str) {
        return CertificateFactory.getInstance(str, (Provider) this.f16631l);
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public void mo2239protected(Ccase ccase) {
        ccase.metrica(this, true);
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public void m2240public(int i, boolean z, byte[] bArr) {
        m2248try(i, z);
        m2220abstract(bArr.length);
        m2232import(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public File m2241return(String str, InputStream inputStream, EnumC13563l enumC13563l) throws IOException {
        File file = new File(m2224class(), m2218synchronized(str, enumC13563l, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    @Override // defpackage.InterfaceC12575l
    public SecretKeyFactory signatures(String str) {
        return SecretKeyFactory.getInstance(str, (Provider) this.f16631l);
    }

    @Override // defpackage.InterfaceC12575l
    public Mac startapp(String str) {
        return Mac.getInstance(str, (Provider) this.f16631l);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public void m2242strictfp(C5138l[] c5138lArr, byte[] bArr, boolean z) {
        byte b;
        int i = ((C13409l) this.f16631l).loadAd;
        C17951l c17951l = new C17951l(128);
        byte[] bArr2 = new byte[506];
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                c17951l.reset();
                c17951l.billing(0, 32, bArr);
                if (z) {
                    c17951l.update((byte) i2);
                    b = (byte) i3;
                } else {
                    c17951l.update((byte) i3);
                    b = (byte) i2;
                }
                c17951l.update(b);
                int i4 = 504;
                c17951l.remoteconfig(0, 504, bArr2);
                int iM2215final = m2215final(((C10685l[]) c5138lArr[i2].f11181l)[i3], 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES, bArr2, 504);
                while (iM2215final < 256) {
                    int i5 = i4 % 3;
                    for (int i6 = 0; i6 < i5; i6++) {
                        bArr2[i6] = bArr2[(i4 - i5) + i6];
                    }
                    c17951l.remoteconfig(i5, 336, bArr2);
                    i4 = i5 + 168;
                    iM2215final += m2215final(((C10685l[]) c5138lArr[i2].f11181l)[i3], iM2215final, 256 - iM2215final, bArr2, i4);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC12575l
    public Cipher subs(String str) {
        return Cipher.getInstance(str, (Provider) this.f16631l);
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public void m2243super(int i) throws IOException {
        ((OutputStream) this.f16631l).write(i);
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public void m2244switch() {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C18449l[] c18449lArr = (C18449l[]) this.f16631l;
            if (i3 >= c18449lArr.length) {
                return;
            }
            C18449l c18449l = c18449lArr[i3];
            int[] iArr = (int[]) c18449l.f36010l;
            int[] iArrMetrica = AbstractC14024l.metrica(i2, iArr.length, iArr);
            int i4 = 1;
            int i5 = 256;
            while (i4 < 256) {
                for (int i6 = i2; i6 < 256; i6 = i + i4) {
                    i5--;
                    int i7 = AbstractC0593l.yandex[i5] * (-1);
                    i = i6;
                    while (i < i6 + i4) {
                        int i8 = iArrMetrica[i];
                        int i9 = i + i4;
                        iArrMetrica[i] = iArrMetrica[i9] + i8;
                        int i10 = i8 - iArrMetrica[i9];
                        iArrMetrica[i9] = i10;
                        iArrMetrica[i9] = AbstractC9549l.crashlytics(((long) i7) * ((long) i10));
                        i++;
                    }
                }
                i4 <<= 1;
                i2 = 0;
            }
            for (int i11 = 0; i11 < 256; i11++) {
                iArrMetrica[i11] = AbstractC9549l.crashlytics(((long) iArrMetrica[i11]) * 41978);
            }
            c18449l.f36010l = iArrMetrica;
            i3++;
            i2 = 0;
        }
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public void m2245this(int i, int i2) throws IOException {
        if (i2 < 31) {
            m2243super(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        m2232import(bArr, i4, 6 - i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [lَۤۖ[]] */
    /* JADX WARN: Type inference failed for: r11v0, types: [lَۤۖ] */
    /* JADX WARN: Type inference failed for: r13v0, types: [lَۤۖ] */
    /* JADX WARN: Type inference failed for: r14v9, types: [lَۤۖ] */
    /* JADX WARN: Type inference failed for: r1v13, types: [lَۤۖ] */
    /* JADX WARN: Type inference failed for: r1v14, types: [lَۤۖ] */
    /* JADX WARN: Type inference failed for: r1v9, types: [lَۤۖ] */
    /* JADX WARN: Type inference failed for: r2v60, types: [lَۤۖ] */
    /* JADX WARN: Type inference failed for: r2v69, types: [lَۤۖ] */
    /* JADX WARN: Type inference failed for: r2v70, types: [lَۤۖ] */
    /* JADX WARN: Type inference failed for: r3v11, types: [lَۤۖ] */
    /* JADX WARN: Type inference failed for: r7v1, types: [lَۤۖ[]] */
    /* JADX WARN: Type inference failed for: r7v46, types: [lَۤۖ] */
    /* JADX WARN: Type inference failed for: r7v5, types: [lَۤۖ] */
    /* JADX WARN: Type inference failed for: r9v19, types: [lَۤۖ] */
    /* JADX WARN: Type inference failed for: r9v2, types: [lَۤۖ[]] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [byte, int] */
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public byte[] m2246throws(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        int i2;
        char c;
        ?? r9;
        char c2;
        char c3;
        char c4;
        byte[] bArr4;
        C13409l c13409l = (C13409l) this.f16631l;
        int i3 = c13409l.loadAd;
        C5138l c5138l = new C5138l(i3);
        ?? r7 = (C10685l[]) c5138l.f11181l;
        C5138l c5138l2 = new C5138l(i3);
        ?? r10 = (C10685l[]) new C5138l(i3).f11181l;
        ?? r11 = (C10685l[]) new C5138l(i3).f11181l;
        ?? c10685l = new C10685l(20);
        ?? c10685l2 = new C10685l(20);
        short[] sArr = (short[]) c10685l2.f21690l;
        short[] sArr2 = new short[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        int i4 = c13409l.crashlytics;
        int i5 = 32;
        byte[] bArr5 = new byte[32];
        c5138l2.m1710default(i, bArr);
        int i6 = i + i4;
        int i7 = 0;
        System.arraycopy(bArr, i6, bArr5, 0, 32);
        int i8 = 0;
        while (true) {
            i2 = i7;
            if (i8 >= i5) {
                break;
            }
            int i9 = bArr2[i8] & 255;
            int i10 = i2;
            for (int i11 = 8; i10 < i11; i11 = 8) {
                sArr2[(i8 * 8) + i10] = (short) (((short) (-((i9 >> i10) & 1))) & 1665);
                i10++;
            }
            i8++;
            i7 = i2;
            i5 = 32;
        }
        C5138l[] c5138lArr = new C5138l[i3];
        for (int i12 = i2; i12 < i3; i12++) {
            c5138lArr[i12] = new C5138l(i3);
        }
        m2242strictfp(c5138lArr, bArr5, true);
        C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        char c5 = 2;
        if (c13409l.billing == 2) {
            int i13 = i2;
            r9 = i13;
            while (i13 < i3) {
                ?? r14 = r7[i13];
                char c6 = c5;
                byte b = (byte) ((r9 == true ? 1 : 0) + 1);
                r14.m2956interface(r9 == true ? (byte) 1 : (byte) 0, c17951l, bArr3);
                i13++;
                r9 = b;
                c5 = c6;
            }
            c = c5;
        } else {
            c = 2;
            int i14 = i2;
            r9 = i14;
            while (i14 < i3) {
                r7[i14].m2960static(r9, c17951l, bArr3);
                i14++;
                r9 = (byte) (r9 + 1);
            }
        }
        int i15 = i2;
        ?? r12 = r9;
        while (i15 < i3) {
            r10[i15].m2956interface(r12, c17951l, bArr3);
            i15++;
            r12 = (byte) (r12 + 1);
        }
        c10685l.m2956interface(r12, c17951l, bArr3);
        c5138l.m1719protected();
        for (int i16 = i2; i16 < i3; i16++) {
            C5138l.m1705transient(r11[i16], c5138lArr[i16], c5138l, c13409l);
        }
        C5138l.m1705transient(c10685l2, c5138l2, c5138l, c13409l);
        for (int i17 = i2; i17 < r11.length; i17++) {
            r11[i17].m2957new();
        }
        c10685l2.m2957new();
        for (int i18 = i2; i18 < r11.length; i18++) {
            r11[i18].m2958private(r10[i18]);
        }
        c10685l2.m2958private(c10685l);
        for (int i19 = i2; i19 < 256; i19++) {
            sArr[i19] = (short) (sArr[i19] + sArr2[i19]);
        }
        for (int i20 = i2; i20 < r11.length; i20++) {
            r11[i20].m2961super();
        }
        c10685l2.m2961super();
        int i21 = c13409l.purchase;
        byte[] bArr6 = new byte[c13409l.isPro];
        for (int i22 = i2; i22 < r11.length; i22++) {
            r11[i22].m2947case();
        }
        char c7 = 3;
        if (r11.length == 4) {
            int i23 = 8;
            short[] sArr3 = new short[8];
            int i24 = i2;
            int i25 = i24;
            while (i24 < r11.length) {
                int i26 = i2;
                while (i26 < 32) {
                    int i27 = i2;
                    while (i27 < i23) {
                        sArr3[i27] = (short) (((((((long) ((short[]) r11[i24].f21690l)[(i26 * 8) + i27]) << 11) + 1664) * 645084) >> 31) & 2047);
                        i27++;
                        i23 = 8;
                    }
                    short s = sArr3[i2];
                    bArr6[i25] = (byte) s;
                    short s2 = sArr3[1];
                    bArr6[i25 + 1] = (byte) ((s >> 8) | (s2 << 3));
                    short s3 = sArr3[c];
                    bArr6[i25 + 2] = (byte) ((s2 >> 5) | (s3 << 6));
                    bArr6[i25 + 3] = (byte) (s3 >> 2);
                    int i28 = s3 >> 10;
                    short s4 = sArr3[3];
                    bArr6[i25 + 4] = (byte) (i28 | (s4 << 1));
                    int i29 = s4 >> 7;
                    short s5 = sArr3[4];
                    bArr6[i25 + 5] = (byte) (i29 | (s5 << 4));
                    int i30 = s5 >> 4;
                    short s6 = sArr3[5];
                    bArr6[i25 + 6] = (byte) (i30 | (s6 << 7));
                    bArr6[i25 + 7] = (byte) (s6 >> 1);
                    int i31 = s6 >> 9;
                    short s7 = sArr3[6];
                    bArr6[i25 + 8] = (byte) (i31 | (s7 << 2));
                    int i32 = s7 >> 6;
                    short s8 = sArr3[7];
                    bArr6[i25 + 9] = (byte) (i32 | (s8 << 5));
                    bArr6[i25 + 10] = (byte) (s8 >> 3);
                    i25 += 11;
                    i26++;
                    i23 = 8;
                }
                i24++;
                i23 = 8;
            }
            c2 = 7;
            c3 = 5;
            c4 = 6;
        } else {
            c2 = 7;
            c3 = 5;
            c4 = 6;
            short[] sArr4 = new short[4];
            int i33 = i2;
            int i34 = i33;
            while (i33 < r11.length) {
                int i35 = i2;
                while (i35 < 64) {
                    int i36 = i2;
                    while (i36 < 4) {
                        sArr4[i36] = (short) (((((((long) ((short[]) r11[i33].f21690l)[(i35 * 4) + i36]) << 10) + 1665) * 1290167) >> 32) & 1023);
                        i36++;
                        sArr = sArr;
                        c7 = c7;
                    }
                    char c8 = c7;
                    short[] sArr5 = sArr;
                    short s9 = sArr4[i2];
                    bArr6[i34] = (byte) s9;
                    short s10 = sArr4[1];
                    bArr6[i34 + 1] = (byte) ((s9 >> 8) | (s10 << 2));
                    short s11 = sArr4[c];
                    bArr6[i34 + 2] = (byte) ((s10 >> 6) | (s11 << 4));
                    int i37 = s11 >> 4;
                    short s12 = sArr4[c8];
                    bArr6[i34 + 3] = (byte) (i37 | (s12 << 6));
                    bArr6[i34 + 4] = (byte) (s12 >> 2);
                    i34 += 5;
                    i35++;
                    sArr = sArr5;
                    c7 = c8;
                }
                i33++;
            }
        }
        char c9 = c7;
        short[] sArr6 = sArr;
        if (i3 == 4) {
            int i38 = 8;
            byte[] bArr7 = new byte[8];
            bArr4 = new byte[160];
            c10685l2.m2947case();
            int i39 = i2;
            int i40 = i39;
            while (i39 < 32) {
                int i41 = i2;
                while (i41 < i38) {
                    bArr7[i41] = (byte) (((((sArr6[(i39 * 8) + i41] << 5) + 1664) * 40318) >> 27) & 31);
                    i41++;
                    i38 = 8;
                }
                bArr4[i40] = (byte) (bArr7[i2] | (bArr7[1] << 5));
                bArr4[i40 + 1] = (byte) ((bArr7[1] >> 3) | (bArr7[c] << 2) | (bArr7[c9] << 7));
                bArr4[i40 + 2] = (byte) ((bArr7[c9] >> 1) | (bArr7[4] << 4));
                bArr4[i40 + 3] = (byte) ((bArr7[4] >> 4) | (bArr7[c3] << 1) | (bArr7[c4] << 6));
                bArr4[i40 + 4] = (byte) ((bArr7[c4] >> 2) | (bArr7[c2] << 3));
                i40 += 5;
                i39++;
                i38 = 8;
            }
        } else {
            byte[] bArr8 = new byte[8];
            bArr4 = new byte[128];
            c10685l2.m2947case();
            int i42 = i2;
            int i43 = i42;
            while (i42 < 32) {
                for (int i44 = i2; i44 < 8; i44++) {
                    bArr8[i44] = (byte) (((((sArr6[(i42 * 8) + i44] << 4) + 1665) * 80635) >> 28) & 15);
                }
                bArr4[i43] = (byte) (bArr8[i2] | (bArr8[1] << 4));
                bArr4[i43 + 1] = (byte) (bArr8[c] | (bArr8[c9] << 4));
                bArr4[i43 + 2] = (byte) (bArr8[4] | (bArr8[c3] << 4));
                bArr4[i43 + 3] = (byte) (bArr8[c4] | (bArr8[c2] << 4));
                i43 += 4;
                i42++;
            }
        }
        System.arraycopy(bArr4, i2, bArr6, i21, c13409l.amazon);
        return bArr6;
    }

    public String toString() {
        switch (this.f16632l) {
            case 9:
                return ((C10127l) this.f16631l).toString();
            case 20:
                C18449l[] c18449lArr = (C18449l[]) this.f16631l;
                String strConcat = "[";
                for (int i = 0; i < c18449lArr.length; i++) {
                    strConcat = strConcat + i + " " + c18449lArr[i].toString();
                    if (i != c18449lArr.length - 1) {
                        strConcat = strConcat.concat(",\n");
                    }
                }
                return strConcat.concat("]");
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public void m2247transient(int i, Object obj, InterfaceC5100l interfaceC5100l) {
        AbstractC1200l abstractC1200l = (AbstractC1200l) obj;
        C10107l c10107l = (C10107l) this.f16631l;
        c10107l.signatures(i, 2);
        c10107l.applovin(abstractC1200l.yandex(interfaceC5100l));
        interfaceC5100l.subs(abstractC1200l, this);
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public void m2248try(int i, boolean z) throws IOException {
        if (z) {
            m2243super(i);
        }
    }

    @Override // defpackage.InterfaceC0208l
    public Object vip(C16916l c16916l) {
        return ((Function1) this.f16631l).invoke(c16916l);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public File m2249volatile(String str) {
        File file = new File(m2224class(), m2218synchronized(str, EnumC13563l.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m2224class(), m2218synchronized(str, EnumC13563l.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(m2224class(), m2218synchronized(str, EnumC13563l.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public void mo2250while(Ccase[] ccaseArr) {
        for (Ccase ccase : ccaseArr) {
            ccase.metrica(this, true);
        }
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l Signature() {
        return this;
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l applovin() {
        return this;
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l firebase() {
        return this;
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l isPro() {
        return this;
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l metrica() {
        return this;
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l mopub() {
        return this;
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l subscription() {
        return this;
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l ad(C3498l c3498l) {
        return this;
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l amazon(int i) {
        return this;
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l isVip(int i) {
        return this;
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l license(InterfaceC8371l interfaceC8371l) {
        return this;
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l purchase(C7073l c7073l) {
        return this;
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l remoteconfig(C6561l c6561l) {
        return this;
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l smaato(InterfaceC3841l interfaceC3841l) {
        return this;
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l tapsense(AbstractC18041l abstractC18041l) {
        return this;
    }

    @Override // defpackage.InterfaceC17729l
    public InterfaceC17729l yandex(List list) {
        return this;
    }

    public /* synthetic */ C7972l(int i, boolean z) {
        this.f16632l = i;
    }

    public C7972l(C16827l c16827l) {
        this.f16632l = 20;
        int i = c16827l.loadAd;
        this.f16631l = new C18449l[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((C18449l[]) this.f16631l)[i2] = new C18449l(c16827l);
        }
    }

    public C7972l(C10107l c10107l) {
        this.f16632l = 6;
        Charset charset = AbstractC4579l.yandex;
        this.f16631l = c10107l;
        c10107l.yandex = this;
    }

    public C7972l(byte[] bArr) throws GeneralSecurityException {
        this.f16632l = 14;
        if (AbstractC12589l.ad(2)) {
            this.f16631l = AbstractC1606l.loadAd(bArr);
        } else {
            C18262l.ads("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
    }

    public /* synthetic */ C7972l(int i, Object obj) {
        this.f16632l = i;
        this.f16631l = obj;
    }
}
