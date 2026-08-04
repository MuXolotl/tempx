package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: renamed from: lُؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2534l implements InterfaceC4326l, InterfaceC7059l {
    public int amazon;
    public Bundle billing;
    public int crashlytics;
    public ClipData loadAd;
    public Uri purchase;
    public final /* synthetic */ int yandex = 0;

    public C2534l(C2534l c2534l) {
        ClipData clipData = c2534l.loadAd;
        clipData.getClass();
        this.loadAd = clipData;
        int i = c2534l.crashlytics;
        AbstractC5641l.crashlytics(i, 0, 5, "source");
        this.crashlytics = i;
        int i2 = c2534l.amazon;
        if ((i2 & 1) == i2) {
            this.amazon = i2;
            this.purchase = c2534l.purchase;
            this.billing = c2534l.billing;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.InterfaceC7059l
    public int amazon() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC7059l
    public int billing() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC4326l
    public C16242l build() {
        return new C16242l(new C2534l(this));
    }

    @Override // defpackage.InterfaceC4326l
    public void crashlytics(int i) {
        this.amazon = i;
    }

    @Override // defpackage.InterfaceC4326l
    public void loadAd(Uri uri) {
        this.purchase = uri;
    }

    @Override // defpackage.InterfaceC7059l
    public ContentInfo purchase() {
        return null;
    }

    @Override // defpackage.InterfaceC4326l
    public void setExtras(Bundle bundle) {
        this.billing = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.yandex) {
            case 1:
                Uri uri = this.purchase;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.loadAd.getDescription());
                sb.append(", source=");
                int i = this.crashlytics;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.amazon;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC0653l.ads(sb, this.billing != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC7059l
    public ClipData yandex() {
        return this.loadAd;
    }

    public /* synthetic */ C2534l() {
    }
}
