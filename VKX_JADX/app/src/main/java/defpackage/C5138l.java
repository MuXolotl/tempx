package defpackage;

import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.yandex;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NotificationCallback;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؗۚؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5138l implements InterfaceC13235l, InterfaceC8145l, InterfaceC18517l, InterfaceC17475l, InterfaceC12356l, NotificationCallback, InterfaceC4041l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C5138l f11176l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static C5138l f11177l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C5138l f11178l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C5138l f11179l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final Object f11180l = new Object();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f11181l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11182l;

    static {
        int i = 1;
        f11176l = new C5138l(i, "TINK");
        f11179l = new C5138l(i, "CRUNCHY");
        f11178l = new C5138l(i, "NO_PREFIX");
    }

    public C5138l(InterfaceC12356l interfaceC12356l, C17326l c17326l) {
        this.f11182l = 21;
        C17326l c17326l2 = new C17326l();
        c17326l2.f33637l = C5746l.f12138l;
        Comparable comparable = EnumC2771l.f6018l;
        c17326l2.f33636l = comparable;
        this.f11181l = c17326l2;
        final C10700l c10700l = new C10700l();
        EnumC2771l enumC2771lYandex = interfaceC12356l.yandex();
        EnumC2771l enumC2771l = EnumC2771l.f6019l;
        c10700l.f21708l = enumC2771lYandex == enumC2771l ? enumC2771l : comparable;
        final C10700l c10700l2 = new C10700l();
        comparable = ((EnumC2771l) c17326l.f33636l) == enumC2771l ? enumC2771l : comparable;
        c10700l2.f21708l = comparable;
        Comparable comparable2 = (Comparable) c10700l.f21708l;
        m1724try((EnumC2771l) (comparable2.compareTo(comparable) <= 0 ? comparable2 : comparable));
        if (c10700l.f21708l == enumC2771l || c10700l2.f21708l == enumC2771l) {
            return;
        }
        final int i = 0;
        Function1 function1 = new Function1() { // from class: lُْۡ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                C10700l c10700l3 = c10700l2;
                C5138l c5138l = this;
                C10700l c10700l4 = c10700l;
                EnumC2771l enumC2771l2 = (EnumC2771l) obj;
                switch (i2) {
                    case 0:
                        c10700l4.f21708l = enumC2771l2;
                        Comparable comparable3 = (Comparable) c10700l3.f21708l;
                        int iCompareTo = enumC2771l2.compareTo(comparable3);
                        Comparable comparable4 = enumC2771l2;
                        if (iCompareTo > 0) {
                            comparable4 = comparable3;
                        }
                        c5138l.m1724try((EnumC2771l) comparable4);
                        break;
                    default:
                        c10700l4.f21708l = enumC2771l2;
                        Comparable comparable5 = (Comparable) c10700l3.f21708l;
                        int iCompareTo2 = enumC2771l2.compareTo(comparable5);
                        Comparable comparable6 = enumC2771l2;
                        if (iCompareTo2 > 0) {
                            comparable6 = comparable5;
                        }
                        c5138l.m1724try((EnumC2771l) comparable6);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        int i2 = 4;
        C8633l c8633l = new C8633l(i2, function1);
        final int i3 = 1;
        C8633l c8633l2 = new C8633l(i2, new Function1() { // from class: lُْۡ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i3;
                C10700l c10700l3 = c10700l;
                C5138l c5138l = this;
                C10700l c10700l4 = c10700l2;
                EnumC2771l enumC2771l2 = (EnumC2771l) obj;
                switch (i4) {
                    case 0:
                        c10700l4.f21708l = enumC2771l2;
                        Comparable comparable3 = (Comparable) c10700l3.f21708l;
                        int iCompareTo = enumC2771l2.compareTo(comparable3);
                        Comparable comparable4 = enumC2771l2;
                        if (iCompareTo > 0) {
                            comparable4 = comparable3;
                        }
                        c5138l.m1724try((EnumC2771l) comparable4);
                        break;
                    default:
                        c10700l4.f21708l = enumC2771l2;
                        Comparable comparable5 = (Comparable) c10700l3.f21708l;
                        int iCompareTo2 = enumC2771l2.compareTo(comparable5);
                        Comparable comparable6 = enumC2771l2;
                        if (iCompareTo2 > 0) {
                            comparable6 = comparable5;
                        }
                        c5138l.m1724try((EnumC2771l) comparable6);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        interfaceC12356l.mopub(c8633l);
        c17326l.mopub(c8633l2);
        if (((EnumC2771l) c17326l2.f33636l) != enumC2771l) {
            c17326l2.mopub(new C8561l(interfaceC12356l, c8633l, c17326l, c8633l2));
        } else {
            interfaceC12356l.crashlytics(c8633l);
            c17326l.crashlytics(c8633l2);
        }
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public static C3823l m1703implements(Callable callable) {
        C2350l c2350l = new C2350l();
        EnumC1150l.f3126l.execute(new RunnableC16301l((Object) callable, (Object) c2350l, false, 2));
        return c2350l.yandex;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static C5138l m1704new() {
        C5138l c5138l;
        synchronized (f11180l) {
            try {
                if (f11177l == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f11177l = new C5138l(handlerThread.getLooper());
                }
                c5138l = f11177l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5138l;
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static void m1705transient(C10685l c10685l, C5138l c5138l, C5138l c5138l2, C13409l c13409l) {
        C10685l c10685l2 = new C10685l(20);
        C10685l c10685l3 = ((C10685l[]) c5138l.f11181l)[0];
        C10685l[] c10685lArr = (C10685l[]) c5138l2.f11181l;
        C10685l.m2945extends(c10685l, c10685l3, c10685lArr[0]);
        for (int i = 1; i < c13409l.loadAd; i++) {
            C10685l.m2945extends(c10685l2, ((C10685l[]) c5138l.f11181l)[i], c10685lArr[i]);
            c10685l.m2958private(c10685l2);
        }
        c10685l.m2961super();
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public static int m1706while(C14965l c14965l, int i, int i2, byte[] bArr, int i3) {
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
                ((short[]) c14965l.f29441l)[i + i4] = s3;
                i4++;
            }
            if (i4 < i2 && s4 < 3329) {
                ((short[]) c14965l.f29441l)[i + i4] = s4;
                i4++;
            }
            i5 = i6;
        }
        return i4;
    }

    @Override // defpackage.InterfaceC17944l
    public /* synthetic */ Set Signature(C6916l c6916l) {
        return AbstractC4338l.billing(this, c6916l);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public C13161l m1707abstract() {
        return new C13161l(((C5866l) this.f11181l).admob());
    }

    @Override // defpackage.InterfaceC17944l
    public /* synthetic */ Object adcel(C6916l c6916l) {
        return AbstractC4338l.firebase(this, c6916l);
    }

    @Override // defpackage.InterfaceC17944l
    public /* synthetic */ Object advert(C6916l c6916l, EnumC10534l enumC10534l) {
        return AbstractC4338l.remoteconfig(this, c6916l, enumC10534l);
    }

    public synchronized void amazon() {
        ((SharedPreferences) this.f11181l).edit().clear().commit();
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public C1796l m1708break(C1414l c1414l) {
        final C1796l c1796l = new C1796l();
        c1796l.amazon = new ArrayList();
        c1796l.purchase = new ArrayList();
        c1796l.crashlytics = this;
        ((ArrayList) this.f11181l).add(c1796l);
        C4553l c4553l = new C4553l();
        c4553l.yandex = 0.0f;
        C15976l c15976l = new C15976l(c4553l);
        c15976l.isPro = 0.001f;
        c1796l.loadAd = c15976l;
        C10427l c10427l = new C10427l();
        c10427l.loadAd(c1414l.yandex);
        c10427l.yandex(c1414l.loadAd);
        c15976l.remoteconfig = c10427l;
        InterfaceC16591l interfaceC16591l = new InterfaceC16591l() { // from class: lًًؗ
            @Override // defpackage.InterfaceC16591l
            public final void admob(float f) {
                C1796l c1796l2 = c1796l;
                c1796l2.yandex = f;
                Iterator it = ((ArrayList) c1796l2.purchase).iterator();
                while (it.hasNext()) {
                    ((InterfaceC9547l) it.next()).yandex(c1796l2);
                }
            }
        };
        if (c15976l.billing) {
            C10754l.ads("Error: Update listeners must be added beforethe animation.");
            return null;
        }
        ArrayList arrayList = c15976l.smaato;
        if (!arrayList.contains(interfaceC16591l)) {
            arrayList.add(interfaceC16591l);
        }
        C1169l c1169l = new C1169l(c1796l);
        ArrayList arrayList2 = c15976l.firebase;
        if (!arrayList2.contains(c1169l)) {
            arrayList2.add(c1169l);
        }
        return c1796l;
    }

    @Override // defpackage.InterfaceC17944l
    /* JADX INFO: renamed from: class */
    public /* synthetic */ EnumC10534l mo860class(C6916l c6916l) {
        return AbstractC4338l.purchase(this, c6916l);
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public void m1709const(int i) {
        AbstractC10000l.isPro(i, 20, (byte[]) this.f11181l);
    }

    @Override // defpackage.InterfaceC12356l
    public void crashlytics(InterfaceC11947l interfaceC11947l) {
        ((C17326l) this.f11181l).crashlytics(interfaceC11947l);
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public void m1710default(int i, byte[] bArr) {
        int i2 = 0;
        while (true) {
            C10685l[] c10685lArr = (C10685l[]) this.f11181l;
            if (i2 >= c10685lArr.length) {
                return;
            }
            C10685l c10685l = c10685lArr[i2];
            int i3 = (i2 * 384) + i;
            c10685l.getClass();
            for (int i4 = 0; i4 < 128; i4++) {
                int i5 = (i4 * 3) + i3;
                int i6 = bArr[i5] & 255;
                int i7 = bArr[i5 + 1] & 255;
                int i8 = bArr[i5 + 2] & 255;
                short[] sArr = (short[]) c10685l.f21690l;
                int i9 = i4 * 2;
                sArr[i9] = (short) ((i6 | (i7 << 8)) & 4095);
                sArr[i9 + 1] = (short) (((i8 << 4) | (i7 >> 4)) & 4095);
            }
            i2++;
        }
    }

    @Override // defpackage.InterfaceC4041l
    /* JADX INFO: renamed from: else */
    public void mo1470else(long[] jArr) {
        long[][] jArr2 = (long[][]) this.f11181l;
        if (jArr2 == null) {
            this.f11181l = (long[][]) Array.newInstance((Class<?>) Long.TYPE, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 4);
        } else {
            long[] jArr3 = jArr2[1];
            if (((jArr[0] ^ jArr3[0]) | (jArr[1] ^ jArr3[1]) | (jArr[2] ^ jArr3[2]) | (jArr[3] ^ jArr3[3])) == 0) {
                return;
            }
        }
        AbstractC3324l.purchase(jArr, ((long[][]) this.f11181l)[1]);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr4 = (long[][]) this.f11181l;
            long[] jArr5 = jArr4[i >> 1];
            long[] jArr6 = jArr4[i];
            long j = jArr5[0];
            long j2 = jArr5[1];
            long j3 = jArr5[2];
            long j4 = jArr5[3];
            jArr6[0] = (j << 1) ^ ((j4 >> 63) & 1061);
            jArr6[1] = (j2 << 1) | (j >>> 63);
            jArr6[2] = (j3 << 1) | (j2 >>> 63);
            jArr6[3] = (j4 << 1) | (j3 >>> 63);
            AbstractC3324l.loadAd(jArr6, jArr4[1], jArr4[i + 1]);
        }
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public int m1711goto() {
        return AbstractC10000l.yandex(20, (byte[]) this.f11181l);
    }

    @Override // defpackage.InterfaceC17944l
    public /* synthetic */ void inmobi(C5131l c5131l) {
        AbstractC4338l.amazon(this, c5131l);
    }

    @Override // defpackage.InterfaceC18517l
    public void isPro(Object obj) {
        C6597l c6597l = (C6597l) obj;
        C13734l c13734l = (C13734l) this.f11181l;
        C17624l c17624l = (C17624l) c13734l.f26814throws.pollFirst();
        if (c17624l == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = c17624l.f34294l;
        int i = c17624l.f34293l;
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411lM2861super = c13734l.crashlytics.m2861super(str);
        if (abstractComponentCallbacksC4411lM2861super != null) {
            abstractComponentCallbacksC4411lM2861super.startapp(i, c6597l.f13816l, c6597l.f13815l);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.InterfaceC4041l
    public void isVip(long[] jArr) {
        long[] jArr2 = new long[4];
        AbstractC3324l.purchase(((long[][]) this.f11181l)[((int) (jArr[3] >>> 56)) & 255], jArr2);
        for (int i = 30; i >= 0; i--) {
            long j = jArr2[0];
            long j2 = jArr2[1];
            long j3 = jArr2[2];
            long j4 = jArr2[3];
            long j5 = j4 >>> 56;
            jArr2[0] = ((((j << 8) ^ j5) ^ (j5 << 2)) ^ (j5 << 5)) ^ (j5 << 10);
            jArr2[1] = (j2 << 8) | (j >>> 56);
            jArr2[2] = (j3 << 8) | (j2 >>> 56);
            jArr2[3] = (j4 << 8) | (j3 >>> 56);
            AbstractC3324l.loadAd(((long[][]) this.f11181l)[((int) (jArr[i >>> 3] >>> ((i & 7) << 3))) & 255], jArr2, jArr2);
        }
        AbstractC3324l.purchase(jArr2, jArr);
    }

    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public void m1712l(int i, Object obj, InterfaceC0060l interfaceC0060l) {
        AbstractC15335l abstractC15335l = (AbstractC15335l) this.f11181l;
        abstractC15335l.tapsense(i, 3);
        interfaceC0060l.isPro(abstractC15335l.yandex, (AbstractC15944l) obj);
        abstractC15335l.tapsense(i, 4);
    }

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public void m1713l(byte[] bArr) {
        int i = 0;
        while (true) {
            C10685l[] c10685lArr = (C10685l[]) this.f11181l;
            if (i >= c10685lArr.length) {
                return;
            }
            C10685l c10685l = c10685lArr[i];
            int i2 = i * 384;
            c10685l.m2947case();
            for (int i3 = 0; i3 < 128; i3++) {
                short[] sArr = (short[]) c10685l.f21690l;
                int i4 = i3 * 2;
                short s = sArr[i4];
                short s2 = sArr[i4 + 1];
                int i5 = (i3 * 3) + i2;
                bArr[i5] = (byte) s;
                bArr[i5 + 1] = (byte) ((s >> 8) | (s2 << 4));
                bArr[i5 + 2] = (byte) (s2 >> 4);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public void m1714l(int i) {
        AbstractC10000l.isPro(i, 24, (byte[]) this.f11181l);
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public void m1715l(int i) {
        byte[] bArr = (byte[]) this.f11181l;
        AbstractC10000l.isPro(i, 16, bArr);
        Arrays.fill(bArr, 20, bArr.length, (byte) 0);
    }

    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public void m1716l(int i, Object obj, InterfaceC0060l interfaceC0060l) {
        AbstractC15944l abstractC15944l = (AbstractC15944l) obj;
        AbstractC15335l abstractC15335l = (AbstractC15335l) this.f11181l;
        abstractC15335l.tapsense(i, 2);
        abstractC15335l.license(abstractC15944l.yandex(interfaceC0060l));
        interfaceC0060l.isPro(this, abstractC15944l);
    }

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public void m1717l(int i) {
        AbstractC10000l.isPro(i, 28, (byte[]) this.f11181l);
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public void m1718l(long j) {
        AbstractC10000l.Signature(j, (byte[]) this.f11181l, 8);
    }

    @Override // defpackage.InterfaceC12356l
    public void mopub(InterfaceC11947l interfaceC11947l) {
        ((C17326l) this.f11181l).mopub(interfaceC11947l);
    }

    @Override // io.realm.kotlin.internal.interop.NotificationCallback
    public void onChange(long j) {
        C4816l c4816l = (C4816l) this.f11181l;
        int i = AbstractC9795l.yandex;
        c4816l.mopub(new LongPointerWrapper(realmcJNI.realm_clone(j), true));
    }

    @Override // defpackage.InterfaceC17475l
    public void premium(char c) {
        ((C7167l) this.f11181l).mopub(c);
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public void m1719protected() {
        int i = 0;
        while (true) {
            C10685l[] c10685lArr = (C10685l[]) this.f11181l;
            if (i >= c10685lArr.length) {
                return;
            }
            C10685l c10685l = c10685lArr[i];
            short[] sArr = (short[]) c10685l.f21690l;
            int i2 = 1;
            for (int i3 = 128; i3 >= 2; i3 >>= 1) {
                int i4 = 0;
                while (i4 < 256) {
                    int i5 = i2 + 1;
                    short s = AbstractC13573l.yandex[i2];
                    int i6 = i4;
                    while (i6 < i4 + i3) {
                        short s2 = sArr[i6];
                        int i7 = i6 + i3;
                        short sAmazon = AbstractC10802l.amazon(sArr[i7] * s);
                        sArr[i7] = (short) (s2 - sAmazon);
                        sArr[i6] = (short) (s2 + sAmazon);
                        i6++;
                    }
                    i4 = i6 + i3;
                    i2 = i5;
                }
            }
            c10685l.m2961super();
            i++;
        }
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public void m1720public() {
        int i = AbstractC14352l.yandex;
        if (((C7420l) subs()).smaato(InterfaceC13235l.purchase, null) == null) {
            return;
        }
        C18725l.loadAd();
    }

    @Override // defpackage.InterfaceC8145l
    public C18595l purchase() {
        C1438l c1438l = new C1438l((SecureRandom) this.f11181l);
        return new C18595l(c1438l.yandex(), c1438l, 7);
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public void m1721return(int i) {
        AbstractC10000l.isPro(i, 0, (byte[]) this.f11181l);
    }

    @Override // defpackage.InterfaceC17944l
    public /* synthetic */ Object smaato(C6916l c6916l, Object obj) {
        return AbstractC4338l.smaato(this, c6916l, obj);
    }

    @Override // defpackage.InterfaceC17944l
    public /* synthetic */ Set startapp() {
        return AbstractC4338l.isPro(this);
    }

    @Override // defpackage.InterfaceC17944l
    /* JADX INFO: renamed from: strictfp */
    public /* synthetic */ boolean mo861strictfp(C6916l c6916l) {
        return AbstractC4338l.crashlytics(this, c6916l);
    }

    @Override // defpackage.InterfaceC15866l
    public InterfaceC17944l subs() {
        return C7420l.f15370l;
    }

    @Override // defpackage.InterfaceC17475l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public void mo1722synchronized(String str) {
        C7167l c7167l = (C7167l) this.f11181l;
        c7167l.mopub(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            String[] strArr = AbstractC4216l.yandex;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                c7167l.mo729return(i, i2, str);
                String str2 = strArr[cCharAt];
                c7167l.mo729return(0, str2.length(), str2);
                i = i2 + 1;
            }
        }
        c7167l.mo729return(i, str.length(), str);
        c7167l.mopub(34);
    }

    @Override // defpackage.InterfaceC17475l
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public void mo1723throw(String str) {
        ((C7167l) this.f11181l).mo706finally(str);
    }

    @Override // defpackage.InterfaceC8145l
    /* JADX INFO: renamed from: throws */
    public void mo274throws(C14785l c14785l) {
        this.f11181l = (SecureRandom) c14785l.f28907l;
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }

    public String toString() {
        switch (this.f11182l) {
            case 1:
                return (String) this.f11181l;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public void m1724try(EnumC2771l enumC2771l) {
        C17326l c17326l = (C17326l) this.f11181l;
        int iOrdinal = enumC2771l.ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = ((EnumC2771l) c17326l.f33636l).ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    AbstractC18263l.billing(c17326l);
                    AbstractC18263l.mopub(c17326l);
                    return;
                } else if (iOrdinal2 == 2 || iOrdinal2 == 3 || iOrdinal2 == 4) {
                    AbstractC18263l.mopub(c17326l);
                    return;
                } else {
                    C18725l.billing();
                    return;
                }
            }
            return;
        }
        if (iOrdinal != 1) {
            EnumC2771l enumC2771l2 = EnumC2771l.f6020l;
            EnumC2771l enumC2771l3 = EnumC2771l.f6021l;
            if (iOrdinal == 2) {
                int iOrdinal3 = ((EnumC2771l) c17326l.f33636l).ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                        AbstractC18263l.billing(c17326l);
                        return;
                    }
                    if (iOrdinal3 != 2) {
                        if (iOrdinal3 != 3 && iOrdinal3 != 4) {
                            C18725l.billing();
                            return;
                        }
                        if (((EnumC2771l) c17326l.f33636l) == enumC2771l2) {
                            c17326l.purchase();
                        }
                        if (((EnumC2771l) c17326l.f33636l) == enumC2771l3) {
                            c17326l.loadAd();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (iOrdinal == 3) {
                int iOrdinal4 = ((EnumC2771l) c17326l.f33636l).ordinal();
                if (iOrdinal4 != 0) {
                    if (iOrdinal4 == 1 || iOrdinal4 == 2) {
                        AbstractC18263l.subs(c17326l);
                        return;
                    }
                    if (iOrdinal4 != 3) {
                        if (iOrdinal4 != 4) {
                            C18725l.billing();
                            return;
                        } else {
                            if (((EnumC2771l) c17326l.f33636l) == enumC2771l2) {
                                c17326l.purchase();
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (iOrdinal != 4) {
                C18725l.billing();
                return;
            }
            int iOrdinal5 = ((EnumC2771l) c17326l.f33636l).ordinal();
            if (iOrdinal5 != 0) {
                if (iOrdinal5 != 1 && iOrdinal5 != 2 && iOrdinal5 != 3) {
                    if (iOrdinal5 == 4) {
                        return;
                    }
                    C18725l.billing();
                } else {
                    AbstractC18263l.subs(c17326l);
                    if (((EnumC2771l) c17326l.f33636l) == enumC2771l3) {
                        c17326l.amazon();
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC17475l
    public void writeLong(long j) {
        ((C7167l) this.f11181l).billing(j);
    }

    @Override // defpackage.InterfaceC12356l
    public EnumC2771l yandex() {
        return (EnumC2771l) ((C17326l) this.f11181l).f33636l;
    }

    public /* synthetic */ C5138l(char c, int i) {
        this.f11182l = i;
    }

    public C5138l(int i) {
        this.f11182l = 23;
        this.f11181l = new C10685l[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((C10685l[]) this.f11181l)[i2] = new C10685l(20);
        }
    }

    public /* synthetic */ C5138l(int i, Object obj) {
        this.f11182l = i;
        this.f11181l = obj;
    }

    public C5138l(C5138l c5138l) {
        this.f11182l = 3;
        byte[] bArr = new byte[32];
        this.f11181l = bArr;
        byte[] bArr2 = (byte[]) c5138l.f11181l;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
    }

    public C5138l(Looper looper) {
        this.f11182l = 2;
        HandlerC4052l handlerC4052l = new HandlerC4052l(looper);
        Looper.getMainLooper();
        this.f11181l = handlerC4052l;
    }

    public C5138l(byte b, int i) {
        this.f11182l = i;
        switch (i) {
            case 7:
                this.f11181l = new C18120l(new Object());
                break;
            case 9:
                this.f11181l = AbstractC8618l.yandex();
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                this.f11181l = new C17893l(0, new C17149l[16]);
                break;
            default:
                this.f11181l = new byte[32];
                break;
        }
    }

    public C5138l(AbstractC15335l abstractC15335l) {
        this.f11182l = 8;
        AbstractC6061l.yandex(abstractC15335l, "output");
        this.f11181l = abstractC15335l;
        abstractC15335l.yandex = this;
    }

    public C5138l(boolean z) {
        this.f11182l = 5;
        this.f11181l = new AtomicBoolean(z);
    }

    public C5138l(Context context) {
        boolean zIsEmpty;
        this.f11182l = 28;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f11181l = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                amazon();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public C5138l(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f11182l = 16;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f11181l = new C9248l(uri, clipDescription, uri2);
        } else {
            this.f11181l = new C0554l(uri, clipDescription, uri2);
        }
    }

    public C5138l(Context context, ComponentName componentName, C18449l c18449l, Bundle bundle) {
        this.f11182l = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f11181l = new C17100l(context, componentName, c18449l, bundle);
        } else {
            this.f11181l = new C9557l(context, componentName, c18449l, bundle);
        }
    }

    public C5138l(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f11182l = 20;
        if (mediaSessionCompat$Token != null) {
            DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f11181l = new C10212l(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f11181l = new yandex(context, mediaSessionCompat$Token);
                return;
            }
        }
        C8339l.metrica("sessionToken must not be null");
        throw null;
    }
}
