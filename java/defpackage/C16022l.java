package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import bruhcollective.itaysonlab.libvkmusic.methods.uma.GetPersonalRadio$Preapi;
import bruhcollective.itaysonlab.libvkmusic.objects.RadioInfo;
import java.util.List;

/* JADX INFO: renamed from: lٕۣ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16022l implements InterfaceC3937l, InterfaceC2841l {
    public final String amazon;
    public final String crashlytics;
    public final RadioInfo loadAd;
    public final String purchase;
    public final AbstractC0301l yandex;

    public C16022l(AbstractC0301l abstractC0301l, RadioInfo radioInfo) {
        this.yandex = abstractC0301l;
        this.loadAd = radioInfo;
        this.crashlytics = abstractC0301l.yandex();
        this.amazon = abstractC0301l.amazon(radioInfo);
        StringBuilder sb = new StringBuilder("Bearer ");
        C3544l c3544l = C3544l.yandex;
        C5993l c5993l = C3544l.loadAd;
        sb.append(c5993l.yandex() ? c5993l.loadAd.loadAd : "");
        this.purchase = sb.toString();
    }

    @Override // defpackage.InterfaceC17817l
    public final boolean billing() {
        return false;
    }

    @Override // defpackage.InterfaceC17817l
    public final String crashlytics() {
        return this.amazon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16022l)) {
            return false;
        }
        C16022l c16022l = (C16022l) obj;
        return AbstractC8576l.yandex(this.yandex, c16022l.yandex) && AbstractC8576l.yandex(this.loadAd, c16022l.loadAd);
    }

    @Override // defpackage.InterfaceC17817l
    public final String getId() {
        return this.crashlytics;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC17817l
    public final String mopub() {
        return this.purchase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2841l
    public final Object purchase(AbstractC0283l abstractC0283l) {
        C3110l c3110l;
        RadioInfo radioInfo;
        if (abstractC0283l instanceof C3110l) {
            c3110l = (C3110l) abstractC0283l;
            int i = c3110l.f6655l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3110l.f6655l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3110l = new C3110l(this, abstractC0283l);
            }
        } else {
            c3110l = new C3110l(this, abstractC0283l);
        }
        Object objLoadAd = c3110l.f6654l;
        int i2 = c3110l.f6655l;
        List list = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            AbstractC13852l abstractC13852lLoadAd = this.yandex.loadAd();
            c3110l.f6655l = 1;
            objLoadAd = abstractC13852lLoadAd.loadAd(c3110l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objLoadAd);
        }
        GetPersonalRadio$Preapi getPersonalRadio$Preapi = (GetPersonalRadio$Preapi) objLoadAd;
        if (getPersonalRadio$Preapi != null && (radioInfo = getPersonalRadio$Preapi.yandex) != null) {
            list = radioInfo.yandex;
        }
        return list == null ? C2580l.f5619l : list;
    }

    public final String toString() {
        return "Radio(type=" + this.yandex + ", config=" + this.loadAd + ')';
    }
}
