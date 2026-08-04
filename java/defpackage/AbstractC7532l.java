package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.io.OutputStream;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lؚۜٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7532l {
    public static final C16786l adcel;
    public static final C16786l admob;
    public static final C16786l ads;
    public static final C16786l billing;
    public static final C16786l firebase;
    public static final C16786l isPro;
    public static final C16786l metrica;
    public static final C16786l mopub;
    public static final C16786l remoteconfig;
    public static final C16786l smaato;
    public static final C16786l startapp;
    public static final C16786l subs;
    public static final C16786l subscription;
    public static final C16786l tapsense;
    public static final C16786l vip;
    public final int amazon;
    public final C15126l crashlytics;
    public final Object loadAd;
    public final int purchase;
    public final InterfaceC1388l yandex;

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        int i = 1;
        int i2 = 1;
        C16786l c16786l = new C16786l(i, c2336l.loadAd(Boolean.TYPE), i2, Boolean.FALSE, 32, 3);
        billing = c16786l;
        Class cls = Integer.TYPE;
        int i3 = 0;
        int i4 = 32;
        C16786l c16786l2 = new C16786l(i, c2336l.loadAd(cls), i2, i3, i4, 10);
        mopub = c16786l2;
        new C2394l(c16786l2, 0);
        C16786l c16786l3 = new C16786l(i, c2336l.loadAd(cls), i2, i3, i4, 19);
        admob = c16786l3;
        new C2394l(c16786l3, 0);
        new C2394l(new C16786l(i, c2336l.loadAd(cls), i2, i3, i4, 12), 0);
        int i5 = 32;
        int i6 = 7;
        int i7 = 4;
        int i8 = 1;
        C16786l c16786l4 = new C16786l(i7, c2336l.loadAd(cls), i8, i3, i5, i6);
        subs = c16786l4;
        new C2394l(c16786l4, 0);
        new C2394l(new C16786l(i7, c2336l.loadAd(cls), i8, i3, i5, i6), 0);
        Class cls2 = Long.TYPE;
        long j = 0L;
        int i9 = 32;
        C16786l c16786l5 = new C16786l(i, c2336l.loadAd(cls2), i2, j, i9, 11);
        isPro = c16786l5;
        new C2394l(c16786l5, 1);
        C16786l c16786l6 = new C16786l(i, c2336l.loadAd(cls2), i2, j, i9, 20);
        firebase = c16786l6;
        new C2394l(c16786l6, 1);
        new C2394l(new C16786l(i, c2336l.loadAd(cls2), i2, j, i9, 13), 1);
        int i10 = 8;
        int i11 = 2;
        C16786l c16786l7 = new C16786l(i11, c2336l.loadAd(cls2), i8, j, i5, i10);
        smaato = c16786l7;
        new C2394l(c16786l7, 1);
        new C2394l(new C16786l(i11, c2336l.loadAd(cls2), i8, j, i5, i10), 1);
        int i12 = 32;
        C16786l c16786l8 = new C16786l(4, c2336l.loadAd(Float.TYPE), i2, Float.valueOf(0.0f), i12, 1);
        remoteconfig = c16786l8;
        new C16891l(c16786l8, (byte) 0);
        C16786l c16786l9 = new C16786l(2, c2336l.loadAd(Double.TYPE), i2, Double.valueOf(0.0d), i12, 0);
        vip = c16786l9;
        new C16891l(c16786l9);
        int i13 = 3;
        C16786l c16786l10 = new C16786l(i13, c2336l.loadAd(C3844l.class), i2, C3844l.f7950l, i12, 4);
        metrica = c16786l10;
        C16786l c16786l11 = new C16786l(i13, c2336l.loadAd(String.class), i2, "", i12, 14);
        startapp = c16786l11;
        int i14 = 48;
        int i15 = 2;
        Object obj = null;
        new C16786l(i13, c2336l.loadAd(Unit.class), i15, obj, i14, 6);
        adcel = new C16786l(i13, c2336l.loadAd(Map.class), i15, obj, i14, 16);
        ads = new C16786l(i13, c2336l.loadAd(Map.class), i15, obj, i14, 15);
        subscription = new C16786l(i, c2336l.loadAd(Void.class), i15, null, 48, 17);
        tapsense = new C16786l(i13, c2336l.loadAd(Object.class), i15, obj, i14, 18);
        AbstractC12155l.amazon(c16786l9, "type.googleapis.com/google.protobuf.DoubleValue");
        AbstractC12155l.amazon(c16786l8, "type.googleapis.com/google.protobuf.FloatValue");
        AbstractC12155l.amazon(c16786l5, "type.googleapis.com/google.protobuf.Int64Value");
        AbstractC12155l.amazon(c16786l6, "type.googleapis.com/google.protobuf.UInt64Value");
        AbstractC12155l.amazon(c16786l2, "type.googleapis.com/google.protobuf.Int32Value");
        AbstractC12155l.amazon(c16786l3, "type.googleapis.com/google.protobuf.UInt32Value");
        AbstractC12155l.amazon(c16786l, "type.googleapis.com/google.protobuf.BoolValue");
        AbstractC12155l.amazon(c16786l11, "type.googleapis.com/google.protobuf.StringValue");
        AbstractC12155l.amazon(c16786l10, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            new C16786l(i13, c2336l.loadAd(Duration.class), i15, null, 48, 5);
        } catch (NoClassDefFoundError unused) {
            new C16786l();
        }
        try {
            new C16786l(i13, AbstractC18202l.yandex.loadAd(Instant.class), i15, null, 48, 9);
        } catch (NoClassDefFoundError unused2) {
            new C16786l();
        }
    }

    public AbstractC7532l(int i, InterfaceC1388l interfaceC1388l, int i2, Object obj) {
        this.amazon = i;
        this.yandex = interfaceC1388l;
        this.purchase = i2;
        this.loadAd = obj;
        boolean z = this instanceof C15322l;
        if (!z && !(this instanceof C15126l) && i != 3) {
            if (i == 3) {
                C8339l.metrica("Unable to pack a length-delimited type.");
                throw null;
            }
            new C15322l(this);
        }
        this.crashlytics = ((this instanceof C15126l) || z) ? null : new C15126l(this);
    }

    public void admob(C13161l c13161l, int i, Object obj) {
        if (obj != null) {
            int i2 = this.amazon;
            c13161l.m3578class((i << 3) | AbstractC9361l.subscription(i2));
            if (i2 == 3) {
                c13161l.m3578class(isPro(obj));
            }
            purchase(c13161l, obj);
        }
    }

    public final void amazon(InterfaceC16805l interfaceC16805l, Object obj) {
        C1080l c1080l = new C1080l(0);
        billing(c1080l, obj);
        c1080l.billing();
        interfaceC16805l.mo736volatile((C0869l) c1080l.f2970l);
    }

    public abstract void billing(C1080l c1080l, Object obj);

    public abstract Object crashlytics(C7084l c7084l);

    public int firebase(int i, Object obj) {
        int i2;
        if (obj == null) {
            return 0;
        }
        int iIsPro = isPro(obj);
        int i3 = 5;
        if (this.amazon == 3) {
            if ((iIsPro & (-128)) == 0) {
                i2 = 1;
            } else if ((iIsPro & (-16384)) == 0) {
                i2 = 2;
            } else if ((iIsPro & (-2097152)) == 0) {
                i2 = 3;
            } else {
                i2 = (iIsPro & (-268435456)) == 0 ? 4 : 5;
            }
            iIsPro += i2;
        }
        int i4 = i << 3;
        if ((i4 & (-128)) == 0) {
            i3 = 1;
        } else if ((i4 & (-16384)) == 0) {
            i3 = 2;
        } else if ((i4 & (-2097152)) == 0) {
            i3 = 3;
        } else if ((i4 & (-268435456)) == 0) {
            i3 = 4;
        }
        return iIsPro + i3;
    }

    public abstract int isPro(Object obj);

    public Object loadAd(C2881l c2881l) {
        C11395l c11395l = c2881l.isPro;
        if (c11395l == null) {
            c11395l = new C11395l(c2881l);
            c2881l.isPro = c11395l;
        }
        return crashlytics(c11395l);
    }

    public final void mopub(OutputStream outputStream, Object obj) {
        C0328l c0328l = new C0328l(outputStream, new C3446l());
        C7167l c7167l = new C7167l(c0328l);
        amazon(c7167l, obj);
        if (c7167l.f14997l) {
            C8339l.smaato("closed");
            return;
        }
        C0869l c0869l = c7167l.f14998l;
        long j = c0869l.f2526l;
        if (j > 0) {
            c0328l.mo390break(c0869l, j);
        }
    }

    public abstract void purchase(C13161l c13161l, Object obj);

    public void subs(C1080l c1080l, int i, Object obj) {
        if (obj != null) {
            int i2 = this.amazon;
            if (i2 == 3) {
                int iLicense = c1080l.license();
                billing(c1080l, obj);
                c1080l.m790default(c1080l.license() - iLicense);
            } else {
                billing(c1080l, obj);
            }
            c1080l.m790default((i << 3) | AbstractC9361l.subscription(i2));
        }
    }

    public final C15126l yandex() {
        C15126l c15126l = this.crashlytics;
        if (c15126l != null) {
            return c15126l;
        }
        C10754l.ads("Can't create a repeated adapter from a repeated or packed adapter.");
        return null;
    }

    public /* synthetic */ AbstractC7532l(int i, InterfaceC1388l interfaceC1388l, int i2, Object obj, int i3) {
        this(i, interfaceC1388l, i2, (i3 & 16) != 0 ? null : obj);
    }
}
