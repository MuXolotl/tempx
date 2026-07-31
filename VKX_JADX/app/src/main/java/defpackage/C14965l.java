package defpackage;

import android.content.Context;
import android.os.Parcel;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.car.app.navigation.model.Maneuver;
import androidx.core.widget.NestedScrollView;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NotificationCallback;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringWriter;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lّٔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C14965l implements InterfaceC10153l, InterfaceC2082l, InterfaceC16334l, InterfaceC11713l, NotificationCallback, InterfaceC17443l, InterfaceC13221l, InterfaceC11545l, InterfaceC15378l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static C14965l f29439l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static volatile C14965l f29440l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f29441l;

    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[PHI: r9
  0x0024: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:5:0x0014, B:10:0x001d, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    public C14965l(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length = fArr.length - 1;
        C0425l[][] c0425lArr = new C0425l[length][];
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            int i6 = 3;
            if (i5 == 0) {
                i = i6;
            } else if (i5 == 1) {
                i2 = 1;
                i = i2;
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        i6 = 4;
                        if (i5 != 4) {
                            i6 = 5;
                            if (i5 != 5) {
                                i = i3;
                            } else {
                                i = i6;
                            }
                        } else {
                            i = i6;
                        }
                    } else {
                        if (i2 != 1) {
                            i2 = 1;
                        }
                        i = i2;
                    }
                }
                i2 = 2;
                i = i2;
            }
            float[] fArr3 = fArr2[i4];
            int i7 = i4 + 1;
            float[] fArr4 = fArr2[i7];
            float f = fArr[i4];
            float f2 = fArr[i7];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            C0425l[] c0425lArr2 = new C0425l[length2];
            int i8 = 0;
            while (i8 < length2) {
                int i9 = i8 * 2;
                C0425l[] c0425lArr3 = c0425lArr2;
                int i10 = i8;
                int i11 = i9 + 1;
                c0425lArr3[i10] = new C0425l(i, f, f2, fArr3[i9], fArr3[i11], fArr4[i9], fArr4[i11]);
                i8 = i10 + 1;
                c0425lArr2 = c0425lArr3;
            }
            c0425lArr[i4] = c0425lArr2;
            i4 = i7;
            i3 = i;
        }
        this.f29441l = c0425lArr;
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        C4184l c4184l = (C4184l) obj;
        C10567l c10567l = (C10567l) c4184l.metrica();
        C3448l c3448lRemoteconfig = AbstractC11990l.remoteconfig();
        BinderC3747l binderC3747l = ((C16014l) this.f29441l).firebase;
        Parcel parcelM743l = c10567l.m743l();
        AbstractC14627l.crashlytics(parcelM743l, binderC3747l);
        AbstractC14627l.loadAd(parcelM743l, c3448lRemoteconfig);
        c10567l.m747l(parcelM743l, 18);
        C10567l c10567l2 = (C10567l) c4184l.metrica();
        C3448l c3448lRemoteconfig2 = AbstractC11990l.remoteconfig();
        Parcel parcelM743l2 = c10567l2.m743l();
        AbstractC14627l.loadAd(parcelM743l2, c3448lRemoteconfig2);
        c10567l2.m747l(parcelM743l2, 17);
        ((C2350l) obj2).loadAd(null);
    }

    public void admob(byte b, C17951l c17951l, byte[] bArr) {
        byte[] bArr2 = new byte[128];
        c17951l.billing(32, 32, bArr);
        c17951l.update(b);
        c17951l.crashlytics(0, 128, bArr2);
        for (int i = 0; i < 32; i++) {
            int iMetrica = AbstractC10000l.metrica(i * 4, bArr2);
            int i2 = (iMetrica & 1431655765) + ((iMetrica >>> 1) & 1431655765);
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i3 * 4;
                ((short[]) this.f29441l)[(i * 8) + i3] = (short) (((short) ((i2 >>> i4) & 3)) - ((short) ((i2 >>> (i4 + 2)) & 3)));
            }
        }
    }

    @Override // defpackage.InterfaceC11713l
    public float amazon() {
        return -((NestedScrollView) this.f29441l).getVerticalScrollFactorCompat();
    }

    @Override // defpackage.InterfaceC16334l
    public Object appmetrica(String str) {
        InterfaceC2165l interfaceC2165l = (InterfaceC2165l) this.f29441l;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return interfaceC2165l.loadAd(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return interfaceC2165l.loadAd(str, null);
    }

    public String billing(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            C9309l c9309l = (C9309l) this.f29441l;
            C18403l c18403l = new C18403l(stringWriter, c9309l.f19121l, c9309l.f19120l, c9309l.f19119l, c9309l.f19122l);
            c18403l.admob(obj);
            c18403l.isPro();
            c18403l.loadAd.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // defpackage.InterfaceC15378l
    public boolean crashlytics(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((InterfaceC15378l[]) this.f29441l)[i].crashlytics(cls)) {
                return true;
            }
        }
        return false;
    }

    public void firebase() {
        ((C6239l) this.f29441l).f13178l.m3730catch();
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return new C6377l(Integer.valueOf(C6377l.f13348l).intValue(), (Context) ((InterfaceC15897l) this.f29441l).get(), "com.google.android.datatransport.events");
    }

    public Set isPro() {
        Set setUnmodifiableSet;
        synchronized (((HashSet) this.f29441l)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f29441l);
        }
        return setUnmodifiableSet;
    }

    @Override // defpackage.InterfaceC15378l
    public C9025l loadAd(Class cls) {
        for (int i = 0; i < 2; i++) {
            InterfaceC15378l interfaceC15378l = ((InterfaceC15378l[]) this.f29441l)[i];
            if (interfaceC15378l.crashlytics(cls)) {
                return interfaceC15378l.loadAd(cls);
            }
        }
        C10754l.ads("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.InterfaceC2082l
    public void lock() {
        ((ReentrantLock) this.f29441l).lock();
    }

    public C18128l mopub(int i) {
        return (C18128l) ((List) this.f29441l).get(i);
    }

    @Override // io.realm.kotlin.internal.interop.NotificationCallback
    public void onChange(long j) {
        C4816l c4816l = (C4816l) this.f29441l;
        int i = AbstractC9795l.yandex;
        c4816l.mopub(new LongPointerWrapper(realmcJNI.realm_clone(j), true));
    }

    @Override // defpackage.InterfaceC11713l
    public void purchase() {
        ((NestedScrollView) this.f29441l).f409l.abortAnimation();
    }

    public void smaato() {
        for (int i = 0; i < 256; i++) {
            short[] sArr = (short[]) this.f29441l;
            short s = sArr[i];
            sArr[i] = (short) (s - ((short) (((short) ((s * 20159) >> 26)) * 3329)));
        }
    }

    public void subs(byte b, C17951l c17951l, byte[] bArr) {
        byte[] bArr2 = new byte[192];
        c17951l.billing(32, 32, bArr);
        c17951l.update(b);
        c17951l.crashlytics(0, 192, bArr2);
        for (int i = 0; i < 64; i++) {
            int iAds = AbstractC10000l.ads(i * 3, bArr2);
            int i2 = (iAds & 2396745) + ((iAds >>> 1) & 2396745) + ((iAds >>> 2) & 2396745);
            for (int i3 = 0; i3 < 4; i3++) {
                int i4 = i3 * 6;
                ((short[]) this.f29441l)[(i * 4) + i3] = (short) (((short) ((i2 >>> i4) & 7)) - ((short) ((i2 >>> (i4 + 3)) & 7)));
            }
        }
    }

    @Override // defpackage.InterfaceC10153l
    /* JADX INFO: renamed from: synchronized */
    public void mo1670synchronized(C17778l c17778l, C18389l c18389l) {
        ((C2397l) this.f29441l).remoteconfig(c18389l, C3499l.f7386l);
    }

    @Override // defpackage.InterfaceC10153l
    /* JADX INFO: renamed from: throw */
    public void mo1671throw(IOException iOException) {
        ((C2397l) this.f29441l).subs(new C18435l(iOException));
    }

    @Override // defpackage.InterfaceC2082l
    public void unlock() {
        ((ReentrantLock) this.f29441l).unlock();
    }

    @Override // defpackage.InterfaceC11713l
    public boolean yandex(float f) {
        if (f == 0.0f) {
            return false;
        }
        purchase();
        ((NestedScrollView) this.f29441l).firebase((int) f);
        return true;
    }

    @Override // defpackage.InterfaceC13221l
    public InterfaceC6269l get(int i) {
        return (InterfaceC6269l) this.f29441l;
    }

    public C14965l(C3647l c3647l) {
        List list = c3647l.f7627l;
        if ((c3647l.f7628l & 1) == 1) {
            int i = c3647l.f7631l;
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC14055l.subscription();
                    throw null;
                }
                C18128l c18128lAdmob = (C18128l) obj;
                if (i2 >= i) {
                    c18128lAdmob.getClass();
                    C7699l c7699lAds = C18128l.ads(c18128lAdmob);
                    c7699lAds.f16163l |= 2;
                    c7699lAds.f16166l = true;
                    c18128lAdmob = c7699lAds.admob();
                    if (!c18128lAdmob.yandex()) {
                        throw new C6451l();
                    }
                }
                arrayList.add(c18128lAdmob);
                i2 = i3;
            }
            list = arrayList;
        }
        this.f29441l = list;
    }

    public C14965l(int i) {
        switch (i) {
            case 3:
                this.f29441l = new C8945l(this);
                break;
            case 5:
                this.f29441l = (CloseCameraDeviceOnCameraGraphCloseQuirk) AbstractC17919l.yandex(CloseCameraDeviceOnCameraGraphCloseQuirk.class);
                break;
            case 13:
                this.f29441l = new C11362l();
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                this.f29441l = new short[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                break;
            case 22:
                this.f29441l = new C6565l(10);
                break;
            case 23:
                this.f29441l = new C8688l(new C1712l(this));
                break;
            default:
                this.f29441l = new HashSet();
                break;
        }
    }

    public /* synthetic */ C14965l(Object obj) {
        this.f29441l = obj;
    }
}
