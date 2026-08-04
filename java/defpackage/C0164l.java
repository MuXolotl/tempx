package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: renamed from: lؙؑۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0164l implements InterfaceC1029l {
    public volatile C0374l amazon;
    public volatile boolean billing;
    public final C8050l crashlytics;
    public final C8795l loadAd;
    public final EnumC9199l purchase;
    public final C13247l yandex;
    public static final List mopub = AbstractC11432l.firebase(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List admob = AbstractC11432l.firebase(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    public C0164l(C11610l c11610l, C13247l c13247l, C8795l c8795l, C8050l c8050l) {
        this.yandex = c13247l;
        this.loadAd = c8795l;
        this.crashlytics = c8050l;
        List list = c11610l.ads;
        EnumC9199l enumC9199l = EnumC9199l.H2_PRIOR_KNOWLEDGE;
        this.purchase = list.contains(enumC9199l) ? enumC9199l : EnumC9199l.HTTP_2;
    }

    @Override // defpackage.InterfaceC1029l
    public final InterfaceC10506l admob(C17032l c17032l, long j) {
        return this.amazon.f1459l;
    }

    @Override // defpackage.InterfaceC1029l
    public final long amazon(C18389l c18389l) {
        if (AbstractC0548l.yandex(c18389l)) {
            return AbstractC11432l.purchase(c18389l);
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC1029l
    public final void billing() {
        this.crashlytics.f16777l.flush();
    }

    @Override // defpackage.InterfaceC1029l
    public final void cancel() {
        this.billing = true;
        C0374l c0374l = this.amazon;
        if (c0374l != null) {
            c0374l.purchase(9);
        }
    }

    @Override // defpackage.InterfaceC1029l
    public final boolean crashlytics() {
        boolean z;
        C0374l c0374l = this.amazon;
        if (c0374l != null) {
            synchronized (c0374l) {
                C17982l c17982l = c0374l.f1452l;
                z = c17982l.f35153l && c17982l.f35156l.subs();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1029l
    public final void isPro(C17032l c17032l) throws IOException {
        int i;
        C0374l c0374l;
        boolean z;
        if (this.amazon != null) {
            return;
        }
        boolean z2 = c17032l.amazon != null;
        C8309l c8309l = c17032l.crashlytics;
        ArrayList arrayList = new ArrayList(c8309l.size() + 4);
        arrayList.add(new C18464l(C18464l.billing, c17032l.loadAd));
        C3844l c3844l = C18464l.mopub;
        C6705l c6705l = c17032l.yandex;
        String strLoadAd = c6705l.loadAd();
        String strAmazon = c6705l.amazon();
        if (strAmazon != null) {
            strLoadAd = AbstractC11043l.admob('?', strLoadAd, strAmazon);
        }
        arrayList.add(new C18464l(c3844l, strLoadAd));
        String strAmazon2 = c8309l.amazon("Host");
        if (strAmazon2 != null) {
            arrayList.add(new C18464l(C18464l.subs, strAmazon2));
        }
        arrayList.add(new C18464l(C18464l.admob, c6705l.yandex));
        int size = c8309l.size();
        for (int i2 = 0; i2 < size; i2++) {
            String lowerCase = c8309l.billing(i2).toLowerCase(Locale.US);
            if (!mopub.contains(lowerCase) || (lowerCase.equals("te") && c8309l.firebase(i2).equals("trailers"))) {
                arrayList.add(new C18464l(lowerCase, c8309l.firebase(i2)));
            }
        }
        C8050l c8050l = this.crashlytics;
        boolean z3 = !z2;
        synchronized (c8050l.f16777l) {
            synchronized (c8050l) {
                try {
                    if (c8050l.f16769l > 1073741823) {
                        c8050l.adcel(8);
                    }
                    if (c8050l.f16773l) {
                        throw new C10085l();
                    }
                    i = c8050l.f16769l;
                    c8050l.f16769l = i + 2;
                    c0374l = new C0374l(i, c8050l, z3, false, null);
                    z = !z2 || c8050l.f16758l >= c8050l.f16757l || c0374l.f1457l >= c0374l.f1456l;
                    if (c0374l.subs()) {
                        c8050l.f16762l.put(Integer.valueOf(i), c0374l);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c8050l.f16777l.adcel(z3, i, arrayList);
        }
        if (z) {
            c8050l.f16777l.flush();
        }
        this.amazon = c0374l;
        boolean z4 = this.billing;
        C0374l c0374l2 = this.amazon;
        if (z4) {
            c0374l2.purchase(9);
            C18262l.metrica("Canceled");
            return;
        }
        C2539l c2539l = c0374l2.f1455l;
        long j = this.loadAd.mopub;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c2539l.mopub(j, timeUnit);
        this.amazon.f1461l.mopub(this.loadAd.admob, timeUnit);
    }

    @Override // defpackage.InterfaceC1029l
    public final void loadAd() throws IOException {
        this.amazon.f1459l.close();
    }

    @Override // defpackage.InterfaceC1029l
    public final InterfaceC1361l mopub() {
        return this.amazon;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    @Override // defpackage.InterfaceC1029l
    public final C10049l purchase(boolean z) throws IOException {
        C8309l c8309l;
        boolean z2;
        C0374l c0374l = this.amazon;
        if (c0374l == null) {
            C18262l.metrica("stream wasn't created");
            return null;
        }
        synchronized (c0374l) {
            while (true) {
                if (!c0374l.f1460l.isEmpty() || c0374l.mopub() != 0) {
                    break;
                }
                if (!z) {
                    c0374l.f1453l.getClass();
                    C17573l c17573l = c0374l.f1459l;
                    z2 = c17573l.f34197l || c17573l.f34199l;
                }
                if (z2) {
                    c0374l.f1455l.admob();
                }
                try {
                    try {
                        c0374l.wait();
                        if (z2) {
                            c0374l.f1455l.smaato();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        c0374l.f1455l.smaato();
                    }
                    throw th;
                }
            }
            if (c0374l.f1460l.isEmpty()) {
                IOException iOException = c0374l.f1449l;
                if (iOException != null) {
                    throw iOException;
                }
                throw new C5333l(c0374l.mopub());
            }
            c8309l = (C8309l) c0374l.f1460l.removeFirst();
        }
        EnumC9199l enumC9199l = this.purchase;
        ArrayList arrayList = new ArrayList(20);
        int size = c8309l.size();
        C13698l c13698lBilling = null;
        for (int i = 0; i < size; i++) {
            String strBilling = c8309l.billing(i);
            String strFirebase = c8309l.firebase(i);
            if (strBilling.equals(":status")) {
                c13698lBilling = AbstractC5832l.billing("HTTP/1.1 ".concat(strFirebase));
            } else if (!admob.contains(strBilling)) {
                arrayList.add(strBilling);
                arrayList.add(AbstractC12024l.m3330l(strFirebase).toString());
            }
        }
        if (c13698lBilling == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C10049l c10049l = new C10049l();
        c10049l.loadAd = enumC9199l;
        c10049l.crashlytics = c13698lBilling.f26744l;
        c10049l.amazon = (String) c13698lBilling.f26746l;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C16543l c16543l = new C16543l((byte) 0, 13);
        AbstractC3984l.pro((ArrayList) c16543l.f32482l, strArr);
        c10049l.billing = c16543l;
        if (z && c10049l.crashlytics == 100) {
            return null;
        }
        return c10049l;
    }

    @Override // defpackage.InterfaceC1029l
    public final InterfaceC17673l subs() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC1029l
    public final InterfaceC14991l yandex(C18389l c18389l) {
        return this.amazon.f1452l;
    }
}
