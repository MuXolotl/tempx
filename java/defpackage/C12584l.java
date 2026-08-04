package defpackage;

import android.content.ClipData;
import android.view.DragEvent;
import kotlin.Unit;

/* JADX INFO: renamed from: lّٓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12584l implements InterfaceC18545l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C6438l f24768l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1645l f24769l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C6438l f24770l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C6438l f24771l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C6438l f24772l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C6438l f24773l;

    public C12584l(C6438l c6438l, C1645l c1645l, C6438l c6438l2, C6438l c6438l3, C6438l c6438l4, C6438l c6438l5) {
        this.f24770l = c6438l;
        this.f24769l = c1645l;
        this.f24768l = c6438l2;
        this.f24772l = c6438l3;
        this.f24771l = c6438l4;
        this.f24773l = c6438l5;
    }

    @Override // defpackage.InterfaceC18545l
    /* JADX INFO: renamed from: lؘِٞ */
    public final boolean mo2322l(C1323l c1323l) {
        String string;
        this.f24770l.invoke(c1323l);
        DragEvent dragEvent = c1323l.yandex;
        ClipData clipData = dragEvent.getClipData();
        dragEvent.getClipDescription();
        C4240l c4240l = (C4240l) this.f24769l.f3986l;
        c4240l.m1513l();
        c4240l.f8681l.amazon();
        int itemCount = clipData.getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            z = z || clipData.getItemAt(i).getText() != null;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            int itemCount2 = clipData.getItemCount();
            boolean z2 = false;
            for (int i2 = 0; i2 < itemCount2; i2++) {
                CharSequence text = clipData.getItemAt(i2).getText();
                if (text != null) {
                    if (z2) {
                        sb.append("\n");
                    }
                    sb.append(text);
                    z2 = true;
                }
            }
            string = sb.toString();
        } else {
            string = null;
        }
        AbstractC5632l.yandex(c4240l);
        if (string != null) {
            C16328l.admob(c4240l.f8682l, string, false, 14);
        }
        return true;
    }

    @Override // defpackage.InterfaceC18545l
    /* JADX INFO: renamed from: l٘ٚۥ */
    public final void mo2323l(C1323l c1323l) {
        DragEvent dragEvent = c1323l.yandex;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
        C4240l c4240l = this.f24772l.f13466l;
        InterfaceC18212l interfaceC18212lLoadAd = c4240l.f8693l.loadAd();
        if (interfaceC18212lLoadAd != null && interfaceC18212lLoadAd.mopub()) {
            jFloatToRawIntBits = interfaceC18212lLoadAd.tapsense(jFloatToRawIntBits);
        }
        int iAmazon = c4240l.f8693l.amazon(jFloatToRawIntBits, true);
        if (iAmazon >= 0) {
            c4240l.f8682l.isPro(AbstractC2296l.loadAd(iAmazon, iAmazon));
        }
        c4240l.f8681l.isVip(EnumC1826l.f4235l, jFloatToRawIntBits);
        Unit unit = Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC18545l
    /* JADX INFO: renamed from: package */
    public final void mo2324package(C1323l c1323l) {
        this.f24773l.invoke(c1323l);
    }

    @Override // defpackage.InterfaceC18545l
    public final void pro(C1323l c1323l) {
        this.f24768l.invoke(c1323l);
    }

    @Override // defpackage.InterfaceC18545l
    /* JADX INFO: renamed from: public */
    public final void mo2325public(C1323l c1323l) {
        this.f24771l.invoke(c1323l);
    }

    @Override // defpackage.InterfaceC18545l
    /* JADX INFO: renamed from: implements */
    public final void mo2321implements(C1323l c1323l) {
    }
}
