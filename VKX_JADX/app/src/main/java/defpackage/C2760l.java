package defpackage;

import android.net.Uri;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lٜؔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2760l implements InterfaceC6384l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final int[] f5988l = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C18595l f5989l = new C18595l(new C18725l(29));

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C18595l f5990l = new C18595l(new C17132l(0));

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C8565l f5991l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f5992l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C13708l f5993l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f5994l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f5995l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f5996l;

    public final void crashlytics(int i, ArrayList arrayList) {
        int i2 = 0;
        switch (i) {
            case 0:
                arrayList.add(new C0565l());
                break;
            case 1:
                arrayList.add(new C9681l());
                break;
            case 2:
                arrayList.add(new C16877l(0));
                break;
            case 3:
                arrayList.add(new C5558l());
                break;
            case 4:
                InterfaceC14833l interfaceC14833lStartapp = f5989l.startapp(0);
                if (interfaceC14833lStartapp == null) {
                    arrayList.add(new C9063l());
                } else {
                    arrayList.add(interfaceC14833lStartapp);
                }
                break;
            case 5:
                arrayList.add(new C8060l());
                break;
            case 6:
                arrayList.add(new C17316l(this.f5991l, this.f5992l ? 0 : 2));
                break;
            case 7:
                arrayList.add(new C15843l(0));
                break;
            case 8:
                C8565l c8565l = this.f5991l;
                int i3 = this.f5995l;
                int i4 = (i3 & 1) != 0 ? 64 : 0;
                if ((i3 & 2) != 0) {
                    i4 |= 128;
                }
                int i5 = (this.f5992l ? 0 : 32) | i4;
                C9258l c9258l = AbstractC1186l.f3181l;
                arrayList.add(new C1721l(c8565l, i5, null, C13708l.f26763l));
                C8565l c8565l2 = this.f5991l;
                int i6 = this.f5995l;
                int i7 = (i6 & 1) == 0 ? 0 : 32;
                if ((2 & i6) != 0) {
                    i7 |= 128;
                }
                arrayList.add(new C17363l(c8565l2, i7 | (this.f5992l ? 0 : 16)));
                break;
            case 9:
                arrayList.add(new C2805l());
                break;
            case 10:
                arrayList.add(new C8116l());
                break;
            case 11:
                if (this.f5993l == null) {
                    C9258l c9258l2 = AbstractC1186l.f3181l;
                    this.f5993l = C13708l.f26763l;
                }
                arrayList.add(new C7251l(1, !this.f5992l ? 1 : 0, this.f5991l, new C16391l(0L), new C17368l(i2, this.f5993l)));
                break;
            case 12:
                C3460l c3460l = new C3460l();
                c3460l.crashlytics = 0;
                c3460l.amazon = -1L;
                c3460l.billing = -1;
                c3460l.mopub = -1L;
                arrayList.add(c3460l);
                break;
            case 14:
                arrayList.add(new C4112l(this.f5994l));
                break;
            case 15:
                InterfaceC14833l interfaceC14833lStartapp2 = f5990l.startapp(new Object[0]);
                if (interfaceC14833lStartapp2 != null) {
                    arrayList.add(interfaceC14833lStartapp2);
                }
                break;
            case 16:
                arrayList.add(new C3297l(!this.f5992l ? 1 : 0, this.f5991l));
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                arrayList.add(new C2988l(1));
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                arrayList.add(new C2905l(1));
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                arrayList.add(new C2988l(0));
                break;
            case 20:
                arrayList.add(new C2706l(this.f5996l));
                break;
            case 21:
                arrayList.add(new C2905l(0));
                break;
        }
    }

    @Override // defpackage.InterfaceC6384l
    public final InterfaceC6384l firebase(boolean z) {
        synchronized (this) {
            this.f5992l = z;
        }
        return this;
    }

    @Override // defpackage.InterfaceC6384l
    public final InterfaceC6384l loadAd(int i) {
        synchronized (this) {
            this.f5995l = i;
        }
        return this;
    }

    @Override // defpackage.InterfaceC6384l
    public final synchronized InterfaceC14833l[] vip(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f5988l;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iPurchase = C5795l.purchase((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iPurchase != -1) {
                crashlytics(iPurchase, arrayList);
            }
            int iBilling = C5795l.billing(uri);
            if (iBilling != -1 && iBilling != iPurchase) {
                crashlytics(iBilling, arrayList);
            }
            for (int i = 0; i < 21; i++) {
                int i2 = iArr[i];
                if (i2 != iPurchase && i2 != iBilling) {
                    crashlytics(i2, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC14833l[]) arrayList.toArray(new InterfaceC14833l[0]);
    }

    @Override // defpackage.InterfaceC6384l
    public final InterfaceC6384l yandex(C8565l c8565l) {
        synchronized (this) {
            this.f5991l = c8565l;
        }
        return this;
    }
}
