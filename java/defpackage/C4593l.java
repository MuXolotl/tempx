package defpackage;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;

/* JADX INFO: renamed from: lؗؒؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4593l implements Closeable {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final Logger f9330l = Logger.getLogger(AbstractC14207l.class.getName());

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C3745l f9331l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C7846l f9332l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC9473l f9333l;

    public C4593l(InterfaceC9473l interfaceC9473l) {
        this.f9333l = interfaceC9473l;
        C7846l c7846l = new C7846l(interfaceC9473l);
        this.f9332l = c7846l;
        this.f9331l = new C3745l(c7846l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final void adcel(C0340l c0340l, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        if (i3 == 0) {
            C18262l.metrica("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = true;
        ?? r2 = 1;
        if ((i2 & 1) == 0) {
            z2 = false;
        }
        if ((i2 & 8) != 0) {
            byte b = this.f9333l.readByte();
            byte[] bArr = AbstractC7712l.yandex;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            InterfaceC9473l interfaceC9473l = this.f9333l;
            interfaceC9473l.readInt();
            interfaceC9473l.readByte();
            byte[] bArr2 = AbstractC7712l.yandex;
            i5 = i - 5;
        } else {
            i5 = i;
        }
        List listVip = vip(AbstractC1383l.amazon(i5, i2, i4), i4, i2, i3);
        C8050l c8050l = (C8050l) c0340l.f1392l;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            C7522l.crashlytics(c8050l.f16772l, c8050l.f16755l + '[' + i3 + "] onHeaders", 0L, new C3025l(c8050l, i3, listVip, z2), 6);
            return;
        }
        synchronized (c8050l) {
            try {
                C0374l c0374lBilling = c8050l.billing(i3);
                try {
                    if (c0374lBilling != null) {
                        Unit unit = Unit.INSTANCE;
                        c0374lBilling.isPro(AbstractC11432l.admob(listVip), z2);
                        return;
                    }
                    if (c8050l.f16773l) {
                        return;
                    }
                    if (i3 <= c8050l.f16770l) {
                        return;
                    }
                    if (i3 % 2 == c8050l.f16769l % 2) {
                        return;
                    }
                    C0374l c0374l = new C0374l(i3, c8050l, false, z2, AbstractC11432l.admob(listVip));
                    c8050l.f16770l = i3;
                    c8050l.f16762l.put(Integer.valueOf(i3), c0374l);
                    C7522l.crashlytics(c8050l.f16756l.amazon(), c8050l.f16755l + '[' + i3 + "] onStream", 0L, new C12242l(c8050l, c0374l, 20), 6);
                    return;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = c8050l;
            }
            Throwable th3 = th;
            throw th3;
        }
    }

    public final void ads(C0340l c0340l, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            C18262l.metrica(AbstractC0653l.vip(i, "TYPE_PING length != 8: "));
            return;
        }
        if (i3 != 0) {
            C18262l.metrica("TYPE_PING streamId != 0");
            return;
        }
        int i4 = this.f9333l.readInt();
        int i5 = this.f9333l.readInt();
        boolean z = (i2 & 1) != 0;
        C8050l c8050l = (C8050l) c0340l.f1392l;
        if (!z) {
            C7522l.crashlytics(c8050l.f16759l, AbstractC0653l.ads(new StringBuilder(), ((C8050l) c0340l.f1392l).f16755l, " ping"), 0L, new C6861l((C8050l) c0340l.f1392l, i4, i5, 1), 6);
            return;
        }
        synchronized (c8050l) {
            try {
                if (i4 == 1) {
                    c8050l.f16771l++;
                } else if (i4 != 2) {
                    if (i4 == 3) {
                        c8050l.notifyAll();
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    c8050l.f16775l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void billing(C0340l c0340l, int i, int i2, int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        if (i3 == 0) {
            C18262l.metrica("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = true;
        if ((i2 & 1) == 0) {
            z3 = false;
        }
        if ((i2 & 32) != 0) {
            C18262l.metrica("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.f9333l.readByte();
            byte[] bArr = AbstractC7712l.yandex;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int iAmazon = AbstractC1383l.amazon(i, i2, i4);
        InterfaceC9473l interfaceC9473l = this.f9333l;
        C8050l c8050l = (C8050l) c0340l.f1392l;
        if (i3 != 0 && (i3 & 1) == 0) {
            C0869l c0869l = new C0869l();
            long j = iAmazon;
            interfaceC9473l.subscription(j);
            interfaceC9473l.ad(c0869l, j);
            C7522l.crashlytics(c8050l.f16772l, c8050l.f16755l + '[' + i3 + "] onData", 0L, new C7033l(c8050l, i3, c0869l, iAmazon, z3), 6);
        } else {
            C0374l c0374lBilling = c8050l.billing(i3);
            if (c0374lBilling == null) {
                ((C8050l) c0340l.f1392l).signatures(i3, 2);
                long j2 = iAmazon;
                ((C8050l) c0340l.f1392l).ads(j2);
                interfaceC9473l.skip(j2);
            } else {
                TimeZone timeZone = AbstractC11432l.yandex;
                C17982l c17982l = c0374lBilling.f1452l;
                long j3 = iAmazon;
                c17982l.getClass();
                long j4 = j3;
                while (true) {
                    C0374l c0374l = c17982l.f35157l;
                    if (j4 <= 0) {
                        TimeZone timeZone2 = AbstractC11432l.yandex;
                        c0374l.f1453l.ads(j3);
                        c17982l.f35157l.f1453l.f16760l.getClass();
                        break;
                    }
                    synchronized (c0374l) {
                        z = c17982l.f35153l;
                        z2 = c17982l.f35156l.f2526l + j4 > c17982l.f35154l;
                        Unit unit = Unit.INSTANCE;
                    }
                    if (z2) {
                        interfaceC9473l.skip(j4);
                        c17982l.f35157l.purchase(4);
                        break;
                    }
                    if (z) {
                        interfaceC9473l.skip(j4);
                        break;
                    }
                    long jAd = interfaceC9473l.ad(c17982l.f35152l, j4);
                    if (jAd == -1) {
                        C8339l.vip();
                        return;
                    }
                    j4 -= jAd;
                    C0374l c0374l2 = c17982l.f35157l;
                    synchronized (c0374l2) {
                        try {
                            if (c17982l.f35155l) {
                                c17982l.f35152l.yandex();
                            } else {
                                C0869l c0869l2 = c17982l.f35156l;
                                boolean z4 = c0869l2.f2526l == 0;
                                c0869l2.mo736volatile(c17982l.f35152l);
                                if (z4) {
                                    c0374l2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    c0374lBilling.isPro(C8309l.f17203l, true);
                }
            }
        }
        this.f9333l.skip(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9333l.close();
    }

    public final void isVip(C0340l c0340l, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            C18262l.metrica("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.f9333l.readByte();
            byte[] bArr = AbstractC7712l.yandex;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.f9333l.readInt() & Alert.DURATION_SHOW_INDEFINITELY;
        List listVip = vip(AbstractC1383l.amazon(i - 4, i2, i4), i4, i2, i3);
        C8050l c8050l = (C8050l) c0340l.f1392l;
        synchronized (c8050l) {
            if (c8050l.f16766l.contains(Integer.valueOf(i5))) {
                c8050l.signatures(i5, 2);
                return;
            }
            c8050l.f16766l.add(Integer.valueOf(i5));
            C7522l.crashlytics(c8050l.f16772l, c8050l.f16755l + '[' + i5 + "] onRequest", 0L, new C3025l(c8050l, i5, listVip), 6);
        }
    }

    public final void mopub(C0340l c0340l, int i, int i2) throws IOException {
        int i3;
        Object[] array;
        if (i < 8) {
            C18262l.metrica(AbstractC0653l.vip(i, "TYPE_GOAWAY length < 8: "));
            return;
        }
        if (i2 != 0) {
            C18262l.metrica("TYPE_GOAWAY streamId != 0");
            return;
        }
        int i4 = this.f9333l.readInt();
        int i5 = this.f9333l.readInt();
        int i6 = i - 8;
        int[] iArrM1673throws = AbstractC5020l.m1673throws(14);
        int length = iArrM1673throws.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i3 = 0;
                break;
            }
            i3 = iArrM1673throws[i7];
            if (AbstractC5020l.inmobi(i3) == i5) {
                break;
            } else {
                i7++;
            }
        }
        if (i3 == 0) {
            C18262l.metrica(AbstractC0653l.vip(i5, "TYPE_GOAWAY unexpected error code: "));
            return;
        }
        C3844l c3844lPremium = C3844l.f7950l;
        if (i6 > 0) {
            c3844lPremium = this.f9333l.premium(i6);
        }
        c3844lPremium.purchase();
        C8050l c8050l = (C8050l) c0340l.f1392l;
        synchronized (c8050l) {
            array = c8050l.f16762l.values().toArray(new C0374l[0]);
            c8050l.f16773l = true;
            Unit unit = Unit.INSTANCE;
        }
        for (C0374l c0374l : (C0374l[]) array) {
            if (c0374l.f1454l > i4 && c0374l.admob()) {
                c0374l.firebase(8);
                ((C8050l) c0340l.f1392l).vip(c0374l.f1454l);
            }
        }
    }

    public final List vip(int i, int i2, int i3, int i4) throws IOException {
        C7846l c7846l = this.f9332l;
        c7846l.f16368l = i;
        c7846l.f16367l = i2;
        c7846l.f16365l = i3;
        c7846l.f16364l = i4;
        C3745l c3745l = this.f9331l;
        C1503l c1503l = c3745l.amazon;
        while (!c1503l.subs()) {
            byte b = c1503l.readByte();
            byte[] bArr = AbstractC7712l.yandex;
            int i5 = b & 255;
            if (i5 == 128) {
                C18262l.metrica("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iBilling = c3745l.billing(i5, 127);
                int i6 = iBilling - 1;
                if (i6 >= 0) {
                    C18464l[] c18464lArr = AbstractC14199l.yandex;
                    if (i6 <= c18464lArr.length - 1) {
                        c3745l.yandex(c18464lArr[i6]);
                    }
                }
                int length = c3745l.billing + 1 + (i6 - AbstractC14199l.yandex.length);
                if (length >= 0) {
                    C18464l[] c18464lArr2 = c3745l.purchase;
                    if (length < c18464lArr2.length) {
                        c3745l.yandex(c18464lArr2[length]);
                    }
                }
                C18262l.metrica(AbstractC0653l.vip(iBilling, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                C18464l[] c18464lArr3 = AbstractC14199l.yandex;
                C3844l c3844lPurchase = c3745l.purchase();
                AbstractC14199l.yandex(c3844lPurchase);
                c3745l.amazon(new C18464l(c3844lPurchase, c3745l.purchase()));
            } else if ((b & 64) == 64) {
                c3745l.amazon(new C18464l(c3745l.crashlytics(c3745l.billing(i5, 63) - 1), c3745l.purchase()));
            } else if ((b & 32) == 32) {
                int iBilling2 = c3745l.billing(i5, 31);
                c3745l.yandex = iBilling2;
                if (iBilling2 < 0 || iBilling2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c3745l.yandex);
                }
                int i7 = c3745l.admob;
                if (iBilling2 < i7) {
                    if (iBilling2 == 0) {
                        AbstractC8669l.m2414strictfp(c3745l.purchase, null);
                        c3745l.billing = c3745l.purchase.length - 1;
                        c3745l.mopub = 0;
                        c3745l.admob = 0;
                    } else {
                        c3745l.loadAd(i7 - iBilling2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C18464l[] c18464lArr4 = AbstractC14199l.yandex;
                C3844l c3844lPurchase2 = c3745l.purchase();
                AbstractC14199l.yandex(c3844lPurchase2);
                c3745l.yandex(new C18464l(c3844lPurchase2, c3745l.purchase()));
            } else {
                c3745l.yandex(new C18464l(c3745l.crashlytics(c3745l.billing(i5, 15) - 1), c3745l.purchase()));
            }
        }
        ArrayList arrayList = c3745l.loadAd;
        List listM4213const = AbstractC16901l.m4213const(arrayList);
        arrayList.clear();
        c3745l.crashlytics = 0L;
        return listM4213const;
    }

    public final boolean yandex(boolean z, C0340l c0340l) throws Exception {
        int i;
        try {
            this.f9333l.subscription(9L);
            int iRemoteconfig = AbstractC7712l.remoteconfig(this.f9333l);
            if (iRemoteconfig > 16384) {
                C18262l.metrica(AbstractC0653l.vip(iRemoteconfig, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int i2 = this.f9333l.readByte() & 255;
            byte b = this.f9333l.readByte();
            int i3 = b & 255;
            int i4 = this.f9333l.readInt();
            int i5 = Integer.MAX_VALUE & i4;
            if (i2 != 8) {
                Logger logger = f9330l;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC14207l.loadAd(true, i5, iRemoteconfig, i2, i3));
                }
            }
            if (z && i2 != 4) {
                C11467l.smaato(AbstractC14207l.yandex(i2), "Expected a SETTINGS frame but was ");
                return false;
            }
            switch (i2) {
                case 0:
                    billing(c0340l, iRemoteconfig, i3, i5);
                    return true;
                case 1:
                    adcel(c0340l, iRemoteconfig, i3, i5);
                    return true;
                case 2:
                    if (iRemoteconfig != 5) {
                        C18262l.metrica(AbstractC15560l.tapsense("TYPE_PRIORITY length: ", iRemoteconfig, " != 5"));
                        return false;
                    }
                    if (i5 == 0) {
                        C18262l.metrica("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    InterfaceC9473l interfaceC9473l = this.f9333l;
                    interfaceC9473l.readInt();
                    interfaceC9473l.readByte();
                    return true;
                case 3:
                    if (iRemoteconfig != 4) {
                        C18262l.metrica(AbstractC15560l.tapsense("TYPE_RST_STREAM length: ", iRemoteconfig, " != 4"));
                        return false;
                    }
                    if (i5 == 0) {
                        C18262l.metrica("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int i6 = this.f9333l.readInt();
                    int[] iArrM1673throws = AbstractC5020l.m1673throws(14);
                    int length = iArrM1673throws.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 < length) {
                            i = iArrM1673throws[i7];
                            if (AbstractC5020l.inmobi(i) != i6) {
                                i7++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        C18262l.metrica(AbstractC0653l.vip(i6, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    C8050l c8050l = (C8050l) c0340l.f1392l;
                    if (i5 == 0 || (i4 & 1) != 0) {
                        C0374l c0374lVip = c8050l.vip(i5);
                        if (c0374lVip != null) {
                            c0374lVip.firebase(i);
                        }
                        return true;
                    }
                    C7522l.crashlytics(c8050l.f16772l, c8050l.f16755l + '[' + i5 + "] onReset", 0L, new C3025l(c8050l, i5, i), 6);
                    return true;
                case 4:
                    InterfaceC9473l interfaceC9473l2 = this.f9333l;
                    if (i5 != 0) {
                        C18262l.metrica("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((b & 1) != 0) {
                        if (iRemoteconfig != 0) {
                            C18262l.metrica("FRAME_SIZE_ERROR ack frame should be empty!");
                            return false;
                        }
                        return true;
                    }
                    if (iRemoteconfig % 6 != 0) {
                        C18262l.metrica(AbstractC0653l.vip(iRemoteconfig, "TYPE_SETTINGS length % 6 != 0: "));
                        return false;
                    }
                    C8463l c8463l = new C8463l();
                    C7488l c7488lStartapp = AbstractC8576l.startapp(6, AbstractC8576l.adcel(0, iRemoteconfig));
                    int i8 = c7488lStartapp.f15488l;
                    int i9 = c7488lStartapp.f15487l;
                    int i10 = c7488lStartapp.f15486l;
                    if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                        while (true) {
                            short s = interfaceC9473l2.readShort();
                            byte[] bArr = AbstractC7712l.yandex;
                            int i11 = s & 65535;
                            int i12 = interfaceC9473l2.readInt();
                            if (i11 != 2) {
                                if (i11 != 4) {
                                    if (i11 == 5 && (i12 < 16384 || i12 > 16777215)) {
                                        C18262l.metrica(AbstractC0653l.vip(i12, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                        return false;
                                    }
                                } else if (i12 < 0) {
                                    C18262l.metrica("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return false;
                                }
                            } else if (i12 != 0 && i12 != 1) {
                                C18262l.metrica("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                return false;
                            }
                            c8463l.loadAd(i11, i12);
                            if (i8 != i9) {
                                i8 += i10;
                            }
                        }
                    }
                    C8050l c8050l2 = (C8050l) c0340l.f1392l;
                    C7522l.crashlytics(c8050l2.f16759l, AbstractC0653l.ads(new StringBuilder(), c8050l2.f16755l, " applyAndAckSettings"), 0L, new C12242l(c0340l, c8463l, 21), 6);
                    return true;
                case 5:
                    isVip(c0340l, iRemoteconfig, i3, i5);
                    return true;
                case 6:
                    ads(c0340l, iRemoteconfig, i3, i5);
                    return true;
                case 7:
                    mopub(c0340l, iRemoteconfig, i5);
                    return true;
                case 8:
                    try {
                        if (iRemoteconfig != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iRemoteconfig);
                        }
                        long j = 2147483647L & ((long) this.f9333l.readInt());
                        if (j == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = f9330l;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(AbstractC14207l.crashlytics(i5, iRemoteconfig, j, true));
                        }
                        C8050l c8050l3 = (C8050l) c0340l.f1392l;
                        if (i5 == 0) {
                            synchronized (c8050l3) {
                                c8050l3.f16757l += j;
                                c8050l3.notifyAll();
                                Unit unit = Unit.INSTANCE;
                            }
                            return true;
                        }
                        C0374l c0374lBilling = c8050l3.billing(i5);
                        if (c0374lBilling != null) {
                            synchronized (c0374lBilling) {
                                c0374lBilling.f1456l += j;
                                if (j > 0) {
                                    c0374lBilling.notifyAll();
                                }
                                Unit unit2 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e) {
                        f9330l.fine(AbstractC14207l.loadAd(true, i5, iRemoteconfig, 8, i3));
                        throw e;
                    }
                default:
                    this.f9333l.skip(iRemoteconfig);
                    return true;
            }
        } catch (EOFException unused) {
        }
    }
}
