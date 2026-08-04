package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؚٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C7265l implements InterfaceC1419l {
    public final AbstractC14648l amazon;
    public int billing;
    public int mopub;
    public AbstractC14648l yandex = null;
    public boolean loadAd = false;
    public boolean crashlytics = false;
    public int purchase = 1;
    public int admob = 1;
    public C2163l subs = null;
    public boolean isPro = false;
    public final ArrayList firebase = new ArrayList();
    public final ArrayList smaato = new ArrayList();

    public C7265l(AbstractC14648l abstractC14648l) {
        this.amazon = abstractC14648l;
    }

    public void amazon(int i) {
        if (this.isPro) {
            return;
        }
        this.isPro = true;
        this.mopub = i;
        for (InterfaceC1419l interfaceC1419l : this.firebase) {
            interfaceC1419l.yandex(interfaceC1419l);
        }
    }

    public final void crashlytics() {
        this.smaato.clear();
        this.firebase.clear();
        this.isPro = false;
        this.mopub = 0;
        this.crashlytics = false;
        this.loadAd = false;
    }

    public final void loadAd(AbstractC14648l abstractC14648l) {
        this.firebase.add(abstractC14648l);
        if (this.isPro) {
            abstractC14648l.yandex(abstractC14648l);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.amazon.loadAd.f22850finally);
        sb.append(":");
        switch (this.purchase) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.isPro ? Integer.valueOf(this.mopub) : "unresolved");
        sb.append(") <t=");
        sb.append(this.smaato.size());
        sb.append(":d=");
        sb.append(this.firebase.size());
        sb.append(">");
        return sb.toString();
    }

    @Override // defpackage.InterfaceC1419l
    public final void yandex(InterfaceC1419l interfaceC1419l) {
        ArrayList<C7265l> arrayList = this.smaato;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C7265l) it.next()).isPro) {
                return;
            }
        }
        this.crashlytics = true;
        AbstractC14648l abstractC14648l = this.yandex;
        if (abstractC14648l != null) {
            abstractC14648l.yandex(this);
        }
        if (this.loadAd) {
            this.amazon.yandex(this);
            return;
        }
        C7265l c7265l = null;
        int i = 0;
        for (C7265l c7265l2 : arrayList) {
            if (!(c7265l2 instanceof C2163l)) {
                i++;
                c7265l = c7265l2;
            }
        }
        if (c7265l != null && i == 1 && c7265l.isPro) {
            C2163l c2163l = this.subs;
            if (c2163l != null) {
                if (!c2163l.isPro) {
                    return;
                } else {
                    this.billing = this.admob * c2163l.mopub;
                }
            }
            amazon(c7265l.mopub + this.billing);
        }
        AbstractC14648l abstractC14648l2 = this.yandex;
        if (abstractC14648l2 != null) {
            abstractC14648l2.yandex(this);
        }
    }
}
