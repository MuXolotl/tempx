package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.cast.CastDevice;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.EOFException;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Adler32;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَؘُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C10111l implements InterfaceC3905l, InterfaceC1361l, InterfaceC17224l, InterfaceC10727l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static C10111l f20583l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static volatile C10111l f20585l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f20586l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f20587l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20588l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f20589l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Object f20581l = new Object();

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final Object f20582l = new Object();

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C4267l f20584l = new C4267l(3);

    public C10111l(int i) {
        this.f20588l = i;
        switch (i) {
            case 3:
                this.f20587l = new HashMap();
                this.f20586l = new HashMap();
                this.f20589l = f20584l;
                break;
            case 6:
                C4553l c4553l = new C4553l();
                c4553l.yandex = Float.NaN;
                this.f20587l = c4553l;
                this.f20586l = new C8550l();
                break;
            case 15:
                C16552l c16552l = AbstractC11463l.yandex;
                C2975l c2975l = AbstractC17278l.yandex.f6462l;
                C2993l c2993lCrashlytics = AbstractC1295l.crashlytics();
                c2975l.getClass();
                this.f20587l = AbstractC11990l.yandex(AbstractC10586l.billing(c2975l, c2993lCrashlytics));
                this.f20589l = AbstractC8020l.smaato(C17123l.yandex);
                break;
            case 16:
                this.f20587l = new int[16];
                this.f20586l = new int[16];
                this.f20589l = new int[16];
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                String string = UUID.randomUUID().toString();
                C3844l c3844l = new C3844l(string.getBytes(AbstractC9050l.yandex));
                c3844l.f7951l = string;
                this.f20587l = c3844l;
                this.f20586l = C3599l.purchase;
                this.f20589l = new ArrayList();
                break;
            default:
                C12240l c12240l = new C12240l();
                c12240l.yandex = new Vector();
                this.f20587l = c12240l;
                C16238l c16238l = new C16238l(0);
                C16238l c16238l2 = new C16238l(1);
                C3749l c3749l = new C3749l();
                C13698l c13698lYandex = AbstractC13675l.yandex();
                C6876l c6876l = EnumC13899l.f27179l;
                c13698lYandex.mo3668catch(c6876l.f27192l, new C16238l(7));
                C5377l c5377l = EnumC13899l.f27185l;
                c13698lYandex.mo3668catch(c5377l.f27192l, new C16238l(6));
                C14751l c14751l = EnumC13899l.f27175l;
                c13698lYandex.mo3668catch(c14751l.f27192l, new C16238l(5));
                C6266l c6266l = EnumC13899l.f27184l;
                c13698lYandex.mo3668catch(c6266l.f27192l, c16238l);
                C0801l c0801l = EnumC13899l.f27188l;
                c13698lYandex.mo3668catch(c0801l.f27192l, c16238l);
                C10332l c10332l = EnumC13899l.f27176l;
                c13698lYandex.mo3668catch(c10332l.f27192l, c16238l);
                C3356l c3356l = EnumC13899l.f27186l;
                c13698lYandex.mo3668catch(c3356l.f27192l, c16238l);
                C2682l c2682l = EnumC13899l.f27187l;
                c13698lYandex.mo3668catch(c2682l.f27192l, new C16238l(4));
                C0575l c0575l = EnumC13899l.f27177l;
                c13698lYandex.mo3668catch(c0575l.f27192l, new C16238l(3));
                C2222l c2222l = EnumC13899l.f27174l;
                c13698lYandex.mo3668catch(c2222l.f27192l, c16238l2);
                C5045l c5045l = EnumC13899l.f27183l;
                c13698lYandex.mo3668catch(c5045l.f27192l, c16238l2);
                C5099l c5099l = EnumC13899l.f27190l;
                c13698lYandex.mo3668catch(c5099l.f27192l, c16238l2);
                C7056l c7056l = EnumC13899l.f27178l;
                c13698lYandex.mo3668catch(c7056l.f27192l, new C16238l(2));
                c13698lYandex.mo3668catch(EnumC13899l.f27182l.f27192l, c3749l);
                c13698lYandex.mo3668catch(EnumC13899l.f27189l.f27192l, c3749l);
                this.f20586l = c13698lYandex.adcel();
                C10360l c10360l = new C10360l(0);
                C10360l c10360l2 = new C10360l(1);
                C13698l c13698lYandex2 = AbstractC13675l.yandex();
                c13698lYandex2.mo3668catch(c6876l.f27192l, new C10360l(7));
                c13698lYandex2.mo3668catch(c5377l.f27192l, new C10360l(6));
                c13698lYandex2.mo3668catch(c14751l.f27192l, new C10360l(5));
                c13698lYandex2.mo3668catch(c6266l.f27192l, c10360l);
                c13698lYandex2.mo3668catch(c0801l.f27192l, c10360l);
                c13698lYandex2.mo3668catch(c10332l.f27192l, c10360l);
                c13698lYandex2.mo3668catch(c3356l.f27192l, c10360l);
                c13698lYandex2.mo3668catch(c2682l.f27192l, new C10360l(4));
                c13698lYandex2.mo3668catch(c0575l.f27192l, new C10360l(3));
                c13698lYandex2.mo3668catch(c2222l.f27192l, c10360l2);
                c13698lYandex2.mo3668catch(c5045l.f27192l, c10360l2);
                c13698lYandex2.mo3668catch(c5099l.f27192l, c10360l2);
                c13698lYandex2.mo3668catch(c7056l.f27192l, new C10360l(2));
                this.f20589l = c13698lYandex2.adcel();
                break;
        }
    }

    public static C10111l ads(Context context) {
        if (f20585l == null) {
            synchronized (f20581l) {
                try {
                    if (f20585l == null) {
                        f20585l = new C10111l(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20585l;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static int m2877package(C10111l c10111l, int i, int i2, byte[] bArr, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2 && i6 < i3) {
            byte b = bArr[i6];
            int i7 = b & 15;
            i6++;
            int i8 = (b & 255) >> 4;
            if (i4 == 2) {
                if (i7 < 15) {
                    ((int[]) c10111l.f20587l)[i + i5] = 2 - (i7 - (((i7 * 205) >> 10) * 5));
                    i5++;
                }
                if (i8 < 15 && i5 < i2) {
                    ((int[]) c10111l.f20587l)[i + i5] = 2 - (i8 - (((i8 * 205) >> 10) * 5));
                    i5++;
                }
            } else if (i4 == 4) {
                if (i7 < 9) {
                    ((int[]) c10111l.f20587l)[i + i5] = 4 - i7;
                    i5++;
                }
                if (i8 < 9 && i5 < i2) {
                    ((int[]) c10111l.f20587l)[i + i5] = 4 - i8;
                    i5++;
                }
            }
        }
        return i5;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static int m2878synchronized(C10111l c10111l, int i, int i2, byte[] bArr, int i3) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i5 + 3;
            if (i6 > i3) {
                break;
            }
            int i7 = (((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255)) & 8388607;
            if (i7 < 8380417) {
                ((int[]) c10111l.f20587l)[i + i4] = i7;
                i4++;
            }
            i5 = i6;
        }
        return i4;
    }

    public static C10111l tapsense() {
        if (f20583l == null) {
            synchronized (C10111l.class) {
                try {
                    if (f20583l == null) {
                        f20583l = new C10111l(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20583l;
    }

    public void Signature() {
        int i;
        int[] iArr = (int[]) this.f20587l;
        int[] iArrMetrica = AbstractC14024l.metrica(0, iArr.length, iArr);
        int i2 = 256;
        for (int i3 = 1; i3 < 256; i3 <<= 1) {
            for (int i4 = 0; i4 < 256; i4 = i + i3) {
                i2--;
                int i5 = AbstractC2920l.loadAd[i2] * (-1);
                i = i4;
                while (i < i4 + i3) {
                    int i6 = iArrMetrica[i];
                    int i7 = i + i3;
                    iArrMetrica[i] = iArrMetrica[i7] + i6;
                    int i8 = i6 - iArrMetrica[i7];
                    iArrMetrica[i7] = i8;
                    iArrMetrica[i7] = AbstractC2238l.admob(((long) i5) * ((long) i8));
                    i++;
                }
            }
        }
        for (int i9 = 0; i9 < 256; i9++) {
            iArrMetrica[i9] = AbstractC2238l.admob(((long) iArrMetrica[i9]) * 41978);
        }
        this.f20587l = iArrMetrica;
    }

    public void ad(C10111l c10111l, C10111l c10111l2) {
        for (int i = 0; i < 256; i++) {
            ((int[]) this.f20587l)[i] = AbstractC2238l.admob(((long) ((int[]) c10111l.f20587l)[i]) * ((long) ((int[]) c10111l2.f20587l)[i]));
        }
    }

    public Object adcel(Class cls, HashSet hashSet) {
        Object objYandex;
        HashMap map = (HashMap) this.f20587l;
        if (AbstractC15011l.admob()) {
            try {
                String simpleName = cls.getSimpleName();
                String strSubstring = simpleName.length() <= 127 ? simpleName : null;
                if (strSubstring == null) {
                    strSubstring = simpleName.substring(0, 127);
                }
                Trace.beginSection(strSubstring);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objYandex = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC13497l interfaceC13497l = (InterfaceC13497l) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listLoadAd = interfaceC13497l.loadAd();
                if (!listLoadAd.isEmpty()) {
                    for (Class cls2 : listLoadAd) {
                        if (!map.containsKey(cls2)) {
                            adcel(cls2, hashSet);
                        }
                    }
                }
                objYandex = interfaceC13497l.yandex((Context) this.f20589l);
                hashSet.remove(cls);
                map.put(cls, objYandex);
            } catch (Throwable th2) {
                throw new C6451l(14, th2);
            }
        }
        Trace.endSection();
        return objYandex;
    }

    @Override // defpackage.InterfaceC17224l
    public void admob() {
        C1080l c1080l = (C1080l) this.f20589l;
        c1080l.getClass();
        c1080l.m797private(new RunnableC16112l(25, this));
    }

    public void advert(int i, byte[] bArr) {
        byte[] bArr2 = new byte[8];
        int i2 = ((C5775l) this.f20586l).admob;
        if (i2 != 2) {
            if (i2 != 4) {
                C18073l.license("Eta needs to be 2 or 4!");
                return;
            }
            for (int i3 = 0; i3 < 128; i3++) {
                int i4 = i3 * 2;
                int[] iArr = (int[]) this.f20587l;
                byte b = (byte) (i2 - iArr[i4]);
                bArr2[0] = b;
                byte b2 = (byte) (i2 - iArr[i4 + 1]);
                bArr2[1] = b2;
                bArr[i + i3] = (byte) ((b2 << 4) | b);
            }
            return;
        }
        for (int i5 = 0; i5 < 32; i5++) {
            int i6 = i5 * 8;
            int[] iArr2 = (int[]) this.f20587l;
            byte b3 = (byte) (i2 - iArr2[i6]);
            bArr2[0] = b3;
            byte b4 = (byte) (i2 - iArr2[i6 + 1]);
            bArr2[1] = b4;
            byte b5 = (byte) (i2 - iArr2[i6 + 2]);
            bArr2[2] = b5;
            bArr2[3] = (byte) (i2 - iArr2[i6 + 3]);
            bArr2[4] = (byte) (i2 - iArr2[i6 + 4]);
            bArr2[5] = (byte) (i2 - iArr2[i6 + 5]);
            bArr2[6] = (byte) (i2 - iArr2[i6 + 6]);
            bArr2[7] = (byte) (i2 - iArr2[i6 + 7]);
            int i7 = (i5 * 3) + i;
            bArr[i7] = (byte) ((b4 << 3) | b3 | (b5 << 6));
            bArr[i7 + 1] = (byte) ((bArr2[2] >> 2) | (bArr2[3] << 1) | (bArr2[4] << 4) | (bArr2[5] << 7));
            bArr[i7 + 2] = (byte) ((bArr2[5] >> 1) | (bArr2[6] << 2) | (bArr2[7] << 5));
        }
    }

    public C4330l amazon() {
        String strConcat = ((String) this.f20587l) == null ? " backendName" : "";
        if (((EnumC14251l) this.f20589l) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new C4330l((String) this.f20587l, (byte[]) this.f20586l, (EnumC14251l) this.f20589l);
        }
        C8339l.smaato("Missing required properties:".concat(strConcat));
        return null;
    }

    public void applovin(long j, long j2, C0869l c0869l) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f20586l;
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            try {
                byteBuffer.limit((int) Math.min(8192L, j2));
                if (((FileChannel) this.f20589l).read(byteBuffer, j) == -1) {
                    throw new EOFException();
                }
                int iPosition = byteBuffer.position();
                c0869l.write((byte[]) this.f20587l, 0, iPosition);
                long j3 = iPosition;
                j += j3;
                j2 -= j3;
                byteBuffer.clear();
            } catch (Throwable th) {
                byteBuffer.clear();
                throw th;
            }
        }
    }

    public C2925l appmetrica(File file, boolean z) throws C13768l {
        String lowerCase = AbstractC5578l.purchase(file.getName()).toLowerCase(Locale.ROOT);
        InterfaceC12831l interfaceC12831l = (InterfaceC12831l) ((AbstractC13675l) this.f20586l).get(lowerCase);
        if (interfaceC12831l != null) {
            return interfaceC12831l.yandex().crashlytics(file, lowerCase, z);
        }
        throw new C13768l(lowerCase, "No Reader associated with this extension:%s");
    }

    @Override // defpackage.InterfaceC1361l
    public InterfaceC14991l billing() {
        return (C1503l) this.f20586l;
    }

    @Override // defpackage.InterfaceC1361l
    public void cancel() {
        ((InterfaceC1361l) this.f20587l).cancel();
    }

    public C11716l crashlytics() throws GeneralSecurityException {
        C7972l c7972l;
        C0346l c0346lLoadAd;
        C2385l c2385l = (C2385l) this.f20587l;
        if (c2385l == null || (c7972l = (C7972l) this.f20586l) == null) {
            C18262l.ads("Cannot build without parameters and/or key material");
            return null;
        }
        if (c2385l.yandex != ((C0346l) c7972l.f16631l).yandex.length) {
            C18262l.ads("Key size mismatch");
            return null;
        }
        if (c2385l.yandex() && ((Integer) this.f20589l) == null) {
            C18262l.ads("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((C2385l) this.f20587l).yandex() && ((Integer) this.f20589l) != null) {
            C18262l.ads("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        C16751l c16751l = ((C2385l) this.f20587l).loadAd;
        if (c16751l == C16751l.f32754l) {
            c0346lLoadAd = AbstractC17168l.yandex;
        } else if (c16751l == C16751l.f32755l) {
            c0346lLoadAd = AbstractC17168l.yandex(((Integer) this.f20589l).intValue());
        } else {
            if (c16751l != C16751l.f32753l) {
                C8339l.smaato("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(c16751l)));
                return null;
            }
            c0346lLoadAd = AbstractC17168l.loadAd(((Integer) this.f20589l).intValue());
        }
        return new C11716l((C2385l) this.f20587l, (C7972l) this.f20586l, c0346lLoadAd, (Integer) this.f20589l);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public void m2879extends(int i) {
        if (i < 10 || 16 < i) {
            throw new GeneralSecurityException(AbstractC0653l.vip(i, "Invalid tag size for AesCmacParameters: "));
        }
        this.f20586l = Integer.valueOf(i);
    }

    public C9335l firebase() {
        UUID uuid = (UUID) this.f20587l;
        C7718l c7718l = (C7718l) this.f20586l;
        C9335l c9335l = new C9335l(uuid, c7718l, (Set) this.f20589l);
        C13152l c13152l = c7718l.isPro;
        boolean z = (Build.VERSION.SDK_INT >= 24 && c13152l.loadAd()) || c13152l.purchase || c13152l.crashlytics || c13152l.amazon;
        C7718l c7718l2 = (C7718l) this.f20586l;
        if (c7718l2.adcel) {
            if (z) {
                C8339l.metrica("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (c7718l2.mopub > 0) {
                C8339l.metrica("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = c7718l2.ad;
        if (str == null) {
            List listM3338public = AbstractC12024l.m3338public(c7718l2.crashlytics, new String[]{"."}, 6);
            String strM3332l = listM3338public.size() == 1 ? (String) listM3338public.get(0) : (String) AbstractC16901l.m4214continue(listM3338public);
            if (strM3332l.length() > 127) {
                strM3332l = AbstractC12024l.m3332l(127, strM3332l);
            }
            c7718l2.ad = strM3332l;
        } else if (str.length() > 127) {
            ((C7718l) this.f20586l).ad = AbstractC12024l.m3332l(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        this.f20587l = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        C7718l c7718l3 = (C7718l) this.f20586l;
        this.f20586l = new C7718l(string, c7718l3.loadAd, c7718l3.crashlytics, c7718l3.amazon, new C4279l(c7718l3.purchase), new C4279l(c7718l3.billing), c7718l3.mopub, c7718l3.admob, c7718l3.subs, new C13152l(c7718l3.isPro), c7718l3.firebase, c7718l3.smaato, c7718l3.remoteconfig, c7718l3.vip, c7718l3.metrica, c7718l3.startapp, c7718l3.adcel, c7718l3.ads, c7718l3.subscription, c7718l3.Signature, c7718l3.license, c7718l3.pro, c7718l3.ad, c7718l3.advert, 524288);
        return c9335l;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public void m2880for(C12105l c12105l) {
        if (c12105l.loadAd.equals("multipart")) {
            this.f20586l = c12105l;
        } else {
            C8936l.smaato(c12105l, "multipart != ");
        }
    }

    public void inmobi() {
        for (int i = 0; i < 256; i++) {
            int[] iArr = (int[]) this.f20587l;
            int i2 = iArr[i];
            iArr[i] = i2 - (((4194304 + i2) >> 23) * 8380417);
        }
    }

    @Override // defpackage.InterfaceC10727l
    public float isPro(float f) {
        AbstractC13264l abstractC13264l = (AbstractC13264l) this.f20587l;
        InterfaceC0993l interfaceC0993l = abstractC13264l.firebase().vip;
        List list = abstractC13264l.firebase().yandex;
        int size = list.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            C10824l c10824l = (C10824l) list.get(i);
            int iLoadAd = AbstractC4447l.loadAd(abstractC13264l.firebase());
            int i2 = -abstractC13264l.firebase().billing;
            int i3 = abstractC13264l.firebase().amazon;
            int i4 = abstractC13264l.firebase().loadAd;
            int i5 = c10824l.firebase;
            abstractC13264l.smaato();
            float fPurchase = i5 - interfaceC0993l.purchase(iLoadAd, i4, i2, i3);
            if (fPurchase <= 0.0f && fPurchase > f3) {
                f3 = fPurchase;
            }
            if (fPurchase >= 0.0f && fPurchase < f2) {
                f2 = fPurchase;
            }
        }
        if (f3 == Float.NEGATIVE_INFINITY) {
            f3 = f2;
        }
        if (f2 == Float.POSITIVE_INFINITY) {
            f2 = f3;
        }
        if (!abstractC13264l.amazon()) {
            if (AbstractC17185l.crashlytics(abstractC13264l, f)) {
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
            }
        }
        if (!abstractC13264l.crashlytics()) {
            f3 = 0.0f;
            if (!AbstractC17185l.crashlytics(abstractC13264l, f)) {
                f2 = 0.0f;
            }
        }
        Float fValueOf = Float.valueOf(f3);
        Float fValueOf2 = Float.valueOf(f2);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = ((Number) ((C0541l) this.f20586l).invoke(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
            AbstractC14825l.crashlytics("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue3;
    }

    public void isVip(int i, byte[] bArr) {
        int i2 = ((C5775l) this.f20586l).admob;
        int i3 = 0;
        if (i2 != 2) {
            if (i2 == 4) {
                while (i3 < 128) {
                    int i4 = i3 * 2;
                    byte b = bArr[i + i3];
                    int[] iArr = (int[]) this.f20587l;
                    iArr[i4] = b & 15;
                    int i5 = i4 + 1;
                    iArr[i5] = (b & 255) >> 4;
                    iArr[i4] = i2 - iArr[i4];
                    iArr[i5] = i2 - iArr[i5];
                    i3++;
                }
                return;
            }
            return;
        }
        while (i3 < 32) {
            int i6 = (i3 * 3) + i;
            int i7 = i3 * 8;
            byte b2 = bArr[i6];
            int[] iArr2 = (int[]) this.f20587l;
            iArr2[i7] = b2 & 7;
            int i8 = i7 + 1;
            int i9 = b2 & 255;
            iArr2[i8] = (i9 >> 3) & 7;
            int i10 = i7 + 2;
            int i11 = bArr[i6 + 1] & 255;
            iArr2[i10] = (i9 >> 6) | ((i11 << 2) & 7);
            int i12 = i7 + 3;
            iArr2[i12] = (i11 >> 1) & 7;
            int i13 = i7 + 4;
            iArr2[i13] = (i11 >> 4) & 7;
            int i14 = i7 + 5;
            int i15 = bArr[i6 + 2] & 255;
            iArr2[i14] = (i11 >> 7) | ((i15 << 1) & 7);
            int i16 = i7 + 6;
            iArr2[i16] = (i15 >> 2) & 7;
            int i17 = i7 + 7;
            iArr2[i17] = (i15 >> 5) & 7;
            iArr2[i7] = i2 - iArr2[i7];
            iArr2[i8] = i2 - iArr2[i8];
            iArr2[i10] = i2 - iArr2[i10];
            iArr2[i12] = i2 - iArr2[i12];
            iArr2[i13] = i2 - iArr2[i13];
            iArr2[i14] = i2 - iArr2[i14];
            iArr2[i16] = i2 - iArr2[i16];
            iArr2[i17] = i2 - iArr2[i17];
            i3++;
        }
    }

    public boolean license() {
        Iterator it = ((CopyOnWriteArrayList) this.f20586l).iterator();
        while (it.hasNext()) {
            if (((C17591l) it.next()).yandex.startapp()) {
                return true;
            }
        }
        return false;
    }

    public C6023l loadAd() {
        Integer num = (Integer) this.f20587l;
        if (num == null) {
            C18262l.ads("key size not set");
            return null;
        }
        if (((Integer) this.f20586l) == null) {
            C18262l.ads("tag size not set");
            return null;
        }
        if (((C1693l) this.f20589l) != null) {
            return new C6023l(num.intValue(), ((Integer) this.f20586l).intValue(), (C1693l) this.f20589l);
        }
        C18262l.ads("variant not set");
        return null;
    }

    public void metrica(Bundle bundle) {
        HashSet hashSet = (HashSet) this.f20586l;
        String string = ((Context) this.f20589l).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC13497l.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    adcel((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C6451l(14, e);
            }
        }
    }

    public C12785l mopub() throws GeneralSecurityException {
        C7972l c7972l;
        C0346l c0346lYandex;
        C0485l c0485l = (C0485l) this.f20587l;
        if (c0485l == null || (c7972l = (C7972l) this.f20586l) == null) {
            C18262l.ads("Cannot build without parameters and/or key material");
            return null;
        }
        if (c0485l.yandex != ((C0346l) c7972l.f16631l).yandex.length) {
            C18262l.ads("Key size mismatch");
            return null;
        }
        if (c0485l.yandex() && ((Integer) this.f20589l) == null) {
            C18262l.ads("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((C0485l) this.f20587l).yandex() && ((Integer) this.f20589l) != null) {
            C18262l.ads("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        C3179l c3179l = ((C0485l) this.f20587l).crashlytics;
        if (c3179l == C3179l.f6840l) {
            c0346lYandex = AbstractC17168l.yandex;
        } else if (c3179l == C3179l.f6838l || c3179l == C3179l.f6839l) {
            c0346lYandex = AbstractC17168l.yandex(((Integer) this.f20589l).intValue());
        } else {
            if (c3179l != C3179l.f6837l) {
                C8339l.smaato("Unknown HmacParameters.Variant: ".concat(String.valueOf(c3179l)));
                return null;
            }
            c0346lYandex = AbstractC17168l.loadAd(((Integer) this.f20589l).intValue());
        }
        return new C12785l((C0485l) this.f20587l, (C7972l) this.f20586l, c0346lYandex, (Integer) this.f20589l);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public void m2881native() {
        ((C7718l) this.f20586l).mopub = 315360000000L;
        if (Long.MAX_VALUE - System.currentTimeMillis() > ((C7718l) this.f20586l).mopub) {
            return;
        }
        C8339l.metrica("The given initial delay is too large and will cause an overflow!");
    }

    public void premium(String str, Bitmap bitmap) {
        synchronized (f20582l) {
            ((C3547l) ((Map) this.f20589l).get(str)).billing = bitmap;
        }
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void m2882private(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f20587l = Integer.valueOf(i);
    }

    @Override // defpackage.InterfaceC17224l
    public void pro(C6788l c6788l, Context context, Looper looper, Looper looper2, C18527l c18527l) {
        C1080l c1080l = new C1080l(Boolean.TRUE, looper2, looper, c18527l, new C14668l(c6788l, 0));
        this.f20589l = c1080l;
        c1080l.m797private(new RunnableC0336l(this, context, 3));
    }

    @Override // defpackage.InterfaceC10727l
    public float purchase(float f, float f2) {
        AbstractC13264l abstractC13264l = (AbstractC13264l) this.f20587l;
        int iRemoteconfig = abstractC13264l.remoteconfig();
        C10086l c10086l = abstractC13264l.remoteconfig;
        int i = ((C4685l) c10086l.getValue()).crashlytics + iRemoteconfig;
        if (i == 0) {
            return 0.0f;
        }
        int i2 = abstractC13264l.purchase;
        if (f < 0.0f) {
            i2++;
        }
        int iPurchase = AbstractC8576l.purchase(((int) (f2 / i)) + i2, 0, abstractC13264l.smaato());
        C5947l c5947l = (C5947l) this.f20589l;
        abstractC13264l.remoteconfig();
        int i3 = ((C4685l) c10086l.getValue()).crashlytics;
        long j = i2;
        long j2 = c5947l.yandex;
        long j3 = j - j2;
        if (j3 < 0) {
            j3 = 0;
        }
        int i4 = (int) j3;
        long j4 = j + j2;
        if (j4 > 2147483647L) {
            j4 = 2147483647L;
        }
        int iAbs = Math.abs((AbstractC8576l.purchase(AbstractC8576l.purchase(iPurchase, i4, (int) j4), 0, abstractC13264l.smaato()) - i2) * i) - i;
        int i5 = iAbs >= 0 ? iAbs : 0;
        if (i5 == 0) {
            return i5;
        }
        return Math.signum(f) * i5;
    }

    public boolean remoteconfig(int i) {
        if (i > 1047552) {
            return true;
        }
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = ((int[]) this.f20587l)[i2];
            if (i3 - ((i3 >> 31) & (i3 * 2)) >= i) {
                return true;
            }
        }
        return false;
    }

    public void signatures() {
        int i;
        int[] iArr = (int[]) this.f20587l;
        int[] iArrMetrica = AbstractC14024l.metrica(0, iArr.length, iArr);
        int i2 = 0;
        for (int i3 = 128; i3 > 0; i3 >>>= 1) {
            for (int i4 = 0; i4 < 256; i4 = i + i3) {
                i2++;
                int i5 = AbstractC2920l.loadAd[i2];
                i = i4;
                while (i < i4 + i3) {
                    int i6 = i + i3;
                    int iAdmob = AbstractC2238l.admob(((long) i5) * ((long) iArrMetrica[i6]));
                    iArrMetrica[i6] = iArrMetrica[i] - iAdmob;
                    iArrMetrica[i] = iArrMetrica[i] + iAdmob;
                    i++;
                }
            }
        }
        this.f20587l = iArrMetrica;
    }

    public void smaato(int i, byte[] bArr) {
        int i2;
        int i3;
        int i4;
        ((C18396l) this.f20589l).getClass();
        byte[] bArr2 = new byte[136];
        C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c17951l.billing(0, i, bArr);
        c17951l.remoteconfig(0, 136, bArr2);
        long j = 0;
        int i5 = 0;
        while (true) {
            i2 = 8;
            if (i5 >= 8) {
                break;
            }
            j |= ((long) (bArr2[i5] & 255)) << (i5 * 8);
            i5++;
        }
        for (int i6 = 0; i6 < 256; i6++) {
            ((int[]) this.f20587l)[i6] = 0;
        }
        int i7 = 256 - ((C5775l) this.f20586l).subs;
        while (i7 < 256) {
            while (true) {
                if (i2 >= 136) {
                    c17951l.remoteconfig(0, 136, bArr2);
                    i2 = 0;
                }
                i3 = i2 + 1;
                i4 = bArr2[i2] & 255;
                if (i4 <= i7) {
                    break;
                } else {
                    i2 = i3;
                }
            }
            int[] iArr = (int[]) this.f20587l;
            iArr[i7] = iArr[i4];
            iArr[i4] = (int) (1 - ((j & 1) * 2));
            j >>= 1;
            i7++;
            i2 = i3;
        }
    }

    public void startapp(String str, String str2) {
        C10419l c10419l = new C10419l(str, str2);
        C7504l c7504l = (C7504l) this.f20586l;
        InterfaceC14029l interfaceC14029l = null;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        int i = 17;
        C7504l c7504lMopub = AbstractC10999l.mopub((C18662l) this.f20587l, null, 0, new C18731l(this, c10419l, interfaceC14029l, i), 3);
        c7504lMopub.mo2154l(new C15079l(i, this));
        this.f20586l = c7504lMopub;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public void m2883strictfp(C4330l c4330l, int i, boolean z) {
        char c;
        C6724l c6724l = (C6724l) this.f20589l;
        Context context = (Context) this.f20587l;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = c4330l.yandex;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        EnumC14251l enumC14251l = c4330l.crashlytics;
        adler32.update(byteBufferAllocate.putInt(AbstractC8542l.yandex(enumC14251l)).array());
        byte[] bArr = c4330l.loadAd;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    AbstractC2991l.subs("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", c4330l);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((C16163l) this.f20586l).yandex().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC8542l.yandex(enumC14251l))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(c6724l.yandex(enumC14251l, jLongValue, i));
            Set set = ((C4807l) c6724l.loadAd.get(enumC14251l)).crashlytics;
            Long l = lValueOf;
            if (set.contains(EnumC2089l.f4680l)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC2089l.f4678l)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(EnumC2089l.f4679l)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC8542l.yandex(enumC14251l));
            if (bArr != null) {
                c = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c = 0;
            }
            builder.setExtras(persistableBundle);
            Integer numValueOf = Integer.valueOf(value);
            Long lValueOf2 = Long.valueOf(c6724l.yandex(enumC14251l, jLongValue, i));
            Integer numValueOf2 = Integer.valueOf(i);
            Object[] objArr = new Object[5];
            objArr[c] = c4330l;
            objArr[1] = numValueOf;
            objArr[2] = lValueOf2;
            objArr[3] = l;
            objArr[4] = numValueOf2;
            String strRemoteconfig = AbstractC2991l.remoteconfig("JobInfoScheduler");
            if (Log.isLoggable(strRemoteconfig, 3)) {
                Log.d(strRemoteconfig, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC3905l
    public /* bridge */ /* synthetic */ InterfaceC3905l subs(Class cls, InterfaceC18528l interfaceC18528l) {
        ((HashMap) this.f20587l).put(cls, interfaceC18528l);
        ((HashMap) this.f20586l).remove(cls);
        return this;
    }

    public boolean subscription() {
        AudioManager audioManager = (AudioManager) this.f20587l;
        audioManager.getClass();
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
            if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                return true;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 26 && audioDeviceInfo.getType() == 22) {
                return true;
            }
            if (i >= 28 && audioDeviceInfo.getType() == 23) {
                return true;
            }
            if (i >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                return true;
            }
            if (i >= 33 && audioDeviceInfo.getType() == 30) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public void m2884throw(byte[] bArr, short s) {
        int i;
        C18396l c18396l = (C18396l) this.f20589l;
        int i2 = ((C5775l) this.f20586l).admob;
        if (i2 == 2) {
            c18396l.getClass();
            i = 1;
        } else if (i2 != 4) {
            C18073l.license("Wrong Dilithium Eta!");
            return;
        } else {
            c18396l.getClass();
            i = 2;
        }
        c18396l.getClass();
        C17951l c17951l = (C17951l) c18396l.f35933l;
        int i3 = i * 136;
        byte[] bArr2 = new byte[i3];
        c17951l.reset();
        c17951l.billing(0, bArr.length, bArr);
        c17951l.billing(0, 2, new byte[]{(byte) s, (byte) (s >> 8)});
        c17951l.remoteconfig(0, i3, bArr2);
        int iM2877package = m2877package(this, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES, bArr2, i3, i2);
        while (iM2877package < 256) {
            c17951l.remoteconfig(0, 136, bArr2);
            iM2877package += m2877package(this, iM2877package, 256 - iM2877package, bArr2, 136, i2);
        }
    }

    @Override // defpackage.InterfaceC1361l
    /* JADX INFO: renamed from: throws */
    public InterfaceC10506l mo489throws() {
        return (C7167l) this.f20589l;
    }

    public String toString() {
        switch (this.f20588l) {
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                StringBuilder sb = new StringBuilder("[");
                int i = 0;
                while (true) {
                    int[] iArr = (int[]) this.f20587l;
                    if (i >= iArr.length) {
                        sb.append("]");
                        return sb.toString();
                    }
                    sb.append(iArr[i]);
                    if (i != ((int[]) this.f20587l).length - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                break;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC17224l
    public boolean vip() {
        C1080l c1080l = (C1080l) this.f20589l;
        if (c1080l == null) {
            return true;
        }
        return ((Boolean) c1080l.tapsense()).booleanValue();
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public void m2885volatile(String str) {
        if (str != null) {
            this.f20587l = str;
        } else {
            C6541l.subs("Null backendName");
        }
    }

    public void yandex(String str, C16995l c16995l) {
        StringBuilder sbAd = AbstractC5020l.ad("form-data; name=");
        C12105l c12105l = C3599l.purchase;
        AbstractC17834l.loadAd("file", sbAd);
        if (str != null) {
            sbAd.append("; filename=");
            AbstractC17834l.loadAd(str, sbAd);
        }
        String string = sbAd.toString();
        ArrayList arrayList = new ArrayList(20);
        AbstractC12081l.crashlytics("Content-Disposition");
        arrayList.add("Content-Disposition");
        arrayList.add(AbstractC12024l.m3330l(string).toString());
        C8309l c8309l = new C8309l((String[]) arrayList.toArray(new String[0]));
        if (c8309l.amazon("Content-Type") != null) {
            C8339l.metrica("Unexpected header: Content-Type");
        } else if (c8309l.amazon("Content-Length") != null) {
            C8339l.metrica("Unexpected header: Content-Length");
        } else {
            ((ArrayList) this.f20589l).add(new C2843l(c8309l, c16995l));
        }
    }

    public C10111l(C5775l c5775l) {
        this.f20588l = 29;
        this.f20587l = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f20586l = c5775l;
        C18396l c18396l = c5775l.ads;
        this.f20589l = c18396l;
        c18396l.getClass();
    }

    public /* synthetic */ C10111l(Object obj, Object obj2, Object obj3, int i) {
        this.f20588l = i;
        this.f20587l = obj;
        this.f20586l = obj2;
        this.f20589l = obj3;
    }

    public C10111l(CastDevice castDevice, C1021l c1021l) {
        this.f20588l = 10;
        AbstractC1051l.isPro(castDevice, "CastDevice parameter cannot be null");
        this.f20587l = castDevice;
        this.f20586l = c1021l;
    }

    public C10111l(List list) {
        this.f20588l = 23;
        this.f20589l = list;
        this.f20587l = new ArrayList(list.size());
        this.f20586l = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.f20587l).add(new C2689l((List) ((C15938l) list.get(i)).loadAd.f833l));
            ((ArrayList) this.f20586l).add(((C15938l) list.get(i)).crashlytics.mo1225l());
        }
    }

    public C10111l(Drawable.Callback callback, Map map) {
        this.f20588l = 2;
        if (TextUtils.isEmpty(null)) {
            this.f20586l = null;
            this.f20589l = map;
            if (!(callback instanceof View)) {
                this.f20587l = null;
                return;
            } else {
                this.f20587l = ((View) callback).getContext().getApplicationContext();
                return;
            }
        }
        throw null;
    }

    public C10111l(InterfaceC1361l interfaceC1361l) {
        this.f20588l = 8;
        this.f20587l = interfaceC1361l;
        this.f20586l = new C1503l(interfaceC1361l.billing());
        this.f20589l = new C7167l(interfaceC1361l.mo489throws());
    }

    public C10111l(FileChannel fileChannel) {
        this.f20588l = 18;
        byte[] bArr = new byte[8192];
        this.f20587l = bArr;
        this.f20586l = ByteBuffer.wrap(bArr);
        this.f20589l = fileChannel;
    }

    public C10111l(View view) {
        this.f20588l = 21;
        this.f20587l = view;
        this.f20586l = AbstractC9968l.crashlytics(3, new C11029l(8, this));
        this.f20589l = new C1770l(view);
    }

    public C10111l(Class cls) {
        this.f20588l = 27;
        this.f20587l = UUID.randomUUID();
        this.f20586l = new C7718l(((UUID) this.f20587l).toString(), (EnumC9176l) null, cls.getName(), (String) null, (C4279l) null, (C4279l) null, 0L, 0L, 0L, (C13152l) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        this.f20589l = AbstractC9905l.billing(cls.getName());
    }

    public C10111l(Runnable runnable) {
        this.f20588l = 24;
        this.f20586l = new CopyOnWriteArrayList();
        this.f20589l = new HashMap();
        this.f20587l = runnable;
    }

    public C10111l(Context context) {
        this.f20588l = 1;
        this.f20589l = context.getApplicationContext();
        this.f20586l = new HashSet();
        this.f20587l = new HashMap();
    }

    public C10111l(byte[] bArr, ListenableFuture listenableFuture) {
        this.f20588l = 9;
        this.f20587l = bArr;
        this.f20586l = null;
        this.f20589l = listenableFuture;
    }

    public C10111l(C3852l c3852l, ListenableFuture listenableFuture) {
        this.f20588l = 9;
        this.f20587l = c3852l.firebase;
        this.f20586l = c3852l.vip;
        this.f20589l = listenableFuture;
    }

    public C10111l(InterfaceC15103l[] interfaceC15103lArr) {
        this.f20588l = 13;
        C3505l c3505l = new C3505l();
        C6353l c6353l = new C6353l();
        c6353l.crashlytics = 1.0f;
        c6353l.amazon = 1.0f;
        C6696l c6696l = C6696l.purchase;
        c6353l.purchase = c6696l;
        c6353l.billing = c6696l;
        c6353l.mopub = c6696l;
        c6353l.admob = c6696l;
        ByteBuffer byteBuffer = InterfaceC15103l.yandex;
        c6353l.firebase = byteBuffer;
        c6353l.smaato = byteBuffer;
        c6353l.loadAd = -1;
        InterfaceC15103l[] interfaceC15103lArr2 = new InterfaceC15103l[interfaceC15103lArr.length + 2];
        this.f20587l = interfaceC15103lArr2;
        System.arraycopy(interfaceC15103lArr, 0, interfaceC15103lArr2, 0, interfaceC15103lArr.length);
        this.f20586l = c3505l;
        this.f20589l = c6353l;
        interfaceC15103lArr2[interfaceC15103lArr.length] = c3505l;
        interfaceC15103lArr2[interfaceC15103lArr.length + 1] = c6353l;
    }

    public /* synthetic */ C10111l(int i, boolean z) {
        this.f20588l = i;
    }
}
