package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌٌِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8715l implements InterfaceC0930l {
    public final C13716l admob;
    public C10976l amazon;
    public final boolean billing;
    public final boolean crashlytics;
    public C9426l isPro;
    public InterfaceC16983l loadAd;
    public final int mopub;
    public final C13716l purchase = new C13716l(0);
    public C9426l subs;
    public final C15161l yandex;

    public C8715l(C15736l c15736l, C15161l c15161l) {
        this.yandex = c15161l;
        this.crashlytics = AbstractC7000l.purchase(c15736l);
        boolean z = false;
        C11905l c11905l = InterfaceC5389l.admob;
        InterfaceC5389l interfaceC5389l = c15736l.loadAd;
        c11905l.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && AbstractC7680l.billing(interfaceC5389l)) {
            z = true;
        }
        this.billing = z;
        int iAmazon = i >= 35 ? AbstractC7680l.amazon(interfaceC5389l) : 1;
        this.mopub = iAmazon;
        if (i >= 35) {
            AbstractC7680l.purchase(interfaceC5389l);
        }
        this.admob = new C13716l(Integer.valueOf(iAmazon));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C9426l yandex(C8715l c8715l, boolean z, int i) {
        int i2;
        InterfaceC1142l interfaceC1142lBilling;
        boolean z2 = (i & 2) != 0;
        C15161l c15161l = c8715l.yandex;
        if (AbstractC5088l.firebase("CXCP")) {
            StringBuilder sb = new StringBuilder("TorchControl#setTorchAsync: torch mode = ");
            sb.append((Object) ("TorchMode(value=" + (z ? 1 : 0) + ')'));
            Log.d("CXCP", sb.toString());
        }
        C9426l c9426l = new C9426l();
        if (c8715l.crashlytics) {
            InterfaceC16983l interfaceC16983l = c8715l.loadAd;
            if (interfaceC16983l != null) {
                c8715l.crashlytics(z ? 1 : 0);
                C9426l c9426l2 = c8715l.subs;
                if (z2) {
                    if (c9426l2 != null) {
                        AbstractC14814l.isVip("There is a new enableTorch being set", c9426l2);
                    }
                    c8715l.subs = null;
                } else if (c9426l2 != null) {
                    AbstractC0140l.vip(c9426l, c9426l2);
                }
                c8715l.subs = c9426l;
                Integer num = z ? 1 : null;
                synchronized (c15161l.amazon) {
                    c15161l.firebase = num;
                    Unit unit = Unit.INSTANCE;
                }
                c15161l.billing();
                List list = C6558l.loadAd;
                C6558l c6558lLoadAd = AbstractC6725l.loadAd(c15161l.purchase());
                if (c6558lLoadAd != null) {
                    i2 = c6558lLoadAd.yandex;
                } else {
                    if (AbstractC5088l.metrica()) {
                        Log.w("CXCP", "TorchControl#setTorchAsync: Failed to convert ae mode of value " + c15161l.purchase() + " with AeMode.fromIntOrNull, fallback to AeMode.ON");
                    }
                    i2 = 1;
                }
                if (z) {
                    if (z) {
                        Integer num2 = (Integer) c8715l.admob.amazon();
                        if (num2 != null) {
                            c8715l.amazon(num2.intValue());
                        }
                    } else {
                        c8715l.amazon(c8715l.mopub);
                    }
                    interfaceC1142lBilling = interfaceC16983l.loadAd();
                } else {
                    interfaceC1142lBilling = interfaceC16983l.billing(i2);
                }
                ((C14750l) interfaceC1142lBilling).mo2154l(new C6135l(interfaceC1142lBilling, c9426l, new C5562l(22)));
            } else {
                AbstractC14814l.isVip("Camera is not active.", c9426l);
            }
        } else {
            c9426l.m2649l(new IllegalStateException("No flash unit"));
        }
        return c9426l;
    }

    public final void amazon(int i) {
        InterfaceC1142l interfaceC1142lIsPro;
        C9426l c9426l = new C9426l();
        if (Build.VERSION.SDK_INT < 35 || !this.billing) {
            c9426l.m2649l(new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
            return;
        }
        C9426l c9426l2 = this.isPro;
        if (c9426l2 != null) {
            if (c9426l2 != null) {
                AbstractC14814l.isVip("There is a new torch strength being set", c9426l2);
            }
            this.isPro = null;
        }
        this.isPro = c9426l;
        c9426l.mo2154l(new C0783l(12, this));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC7680l.mopub(linkedHashMap, i);
        InterfaceC16983l interfaceC16983l = this.loadAd;
        if (interfaceC16983l == null || (interfaceC1142lIsPro = interfaceC16983l.isPro(linkedHashMap, AbstractC3222l.loadAd)) == null) {
            AbstractC14814l.isVip("Camera is not active.", c9426l);
        } else {
            AbstractC0140l.vip(interfaceC1142lIsPro, c9426l);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void crashlytics(int i) {
        this.amazon = new C10976l(i);
        int i2 = i != 1 ? 0 : 1;
        boolean zPurchase = AbstractC12225l.purchase();
        C13716l c13716l = this.purchase;
        if (zPurchase) {
            c13716l.subs(Integer.valueOf(i2));
        } else {
            c13716l.isPro(Integer.valueOf(i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    @Override // defpackage.InterfaceC0930l
    public final void loadAd(InterfaceC16983l interfaceC16983l) {
        boolean z;
        this.loadAd = interfaceC16983l;
        if (this.amazon != null) {
            Integer num = (Integer) this.purchase.amazon();
            if (num != null) {
                z = num.intValue() == 1;
            }
            yandex(this, z, 4);
        }
    }

    @Override // defpackage.InterfaceC0930l
    public final void reset() {
        C9426l c9426l = this.subs;
        if (c9426l != null) {
            AbstractC14814l.isVip("There is a new enableTorch being set", c9426l);
        }
        this.subs = null;
        C9426l c9426l2 = this.isPro;
        if (c9426l2 != null) {
            AbstractC14814l.isVip("There is a new torch strength being set", c9426l2);
        }
        this.isPro = null;
        if (this.amazon != null) {
            crashlytics(0);
            yandex(this, false, 6);
            this.amazon = null;
        }
    }
}
