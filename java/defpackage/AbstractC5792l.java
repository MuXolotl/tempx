package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: lؘٚۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5792l implements InterfaceC15103l {
    public boolean admob;
    public C6696l amazon;
    public ByteBuffer billing;
    public C6696l crashlytics;
    public C6696l loadAd;
    public ByteBuffer mopub;
    public C6696l purchase;

    public AbstractC5792l() {
        ByteBuffer byteBuffer = InterfaceC15103l.yandex;
        this.billing = byteBuffer;
        this.mopub = byteBuffer;
        C6696l c6696l = C6696l.purchase;
        this.amazon = c6696l;
        this.purchase = c6696l;
        this.loadAd = c6696l;
        this.crashlytics = c6696l;
    }

    @Override // defpackage.InterfaceC15103l
    public boolean admob() {
        return this.admob && this.mopub == InterfaceC15103l.yandex;
    }

    @Override // defpackage.InterfaceC15103l
    public final void isPro(C4388l c4388l) {
        this.mopub = InterfaceC15103l.yandex;
        this.admob = false;
        this.loadAd = this.amazon;
        this.crashlytics = this.purchase;
        loadAd();
    }

    @Override // defpackage.InterfaceC15103l
    public boolean mopub() {
        return this.purchase != C6696l.purchase;
    }

    public final ByteBuffer purchase(int i) {
        if (this.billing.capacity() < i) {
            this.billing = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.billing.clear();
        }
        ByteBuffer byteBuffer = this.billing;
        this.mopub = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.InterfaceC15103l
    public final void remoteconfig() {
        this.admob = true;
        crashlytics();
    }

    @Override // defpackage.InterfaceC15103l
    public final void reset() {
        ByteBuffer byteBuffer = InterfaceC15103l.yandex;
        this.mopub = byteBuffer;
        this.admob = false;
        this.billing = byteBuffer;
        C6696l c6696l = C6696l.purchase;
        this.amazon = c6696l;
        this.purchase = c6696l;
        this.loadAd = c6696l;
        this.crashlytics = c6696l;
        amazon();
    }

    @Override // defpackage.InterfaceC15103l
    public final C6696l smaato(C6696l c6696l) {
        this.amazon = c6696l;
        this.purchase = yandex(c6696l);
        return mopub() ? this.purchase : C6696l.purchase;
    }

    @Override // defpackage.InterfaceC15103l
    public ByteBuffer subs() {
        ByteBuffer byteBuffer = this.mopub;
        this.mopub = InterfaceC15103l.yandex;
        return byteBuffer;
    }

    public abstract C6696l yandex(C6696l c6696l);

    public void amazon() {
    }

    public void crashlytics() {
    }

    public void loadAd() {
    }

    @Override // defpackage.InterfaceC15103l
    public long vip(long j) {
        return j;
    }
}
