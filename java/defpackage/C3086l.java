package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

/* JADX INFO: renamed from: lؔۨٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C3086l implements InterfaceC8393l, InterfaceC2841l, InterfaceC3136l {
    public static final C2225l Companion = new C2225l();
    public static final InterfaceC1220l[] mopub = {null, null, AbstractC9968l.crashlytics(2, new C8810l(23)), null, null, null};
    public final String amazon;
    public final String billing;
    public final Map crashlytics;
    public final String loadAd;
    public boolean purchase;
    public final String yandex;

    public /* synthetic */ C3086l(int i, String str, String str2, Map map, String str3, boolean z, String str4) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C1292l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = C14054l.f27396l;
        } else {
            this.crashlytics = map;
        }
        if ((i & 8) == 0) {
            this.amazon = "";
        } else {
            this.amazon = str3;
        }
        if ((i & 16) == 0) {
            this.purchase = false;
        } else {
            this.purchase = z;
        }
        if ((i & 32) != 0) {
            this.billing = str4;
            return;
        }
        this.billing = "vk_mix_" + str + '_' + this.loadAd + '_' + AbstractC16901l.m4210case(this.crashlytics.entrySet(), null, null, null, new C10949l(28), 31);
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
        if (!(obj instanceof C3086l)) {
            return false;
        }
        C3086l c3086l = (C3086l) obj;
        return AbstractC8576l.yandex(this.yandex, c3086l.yandex) && AbstractC8576l.yandex(this.loadAd, c3086l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c3086l.crashlytics) && AbstractC8576l.yandex(this.amazon, c3086l.amazon);
    }

    @Override // defpackage.InterfaceC17817l
    public final String getId() {
        return this.billing;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        return this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @Override // defpackage.InterfaceC17817l
    public final String mopub() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2841l
    public final Object purchase(AbstractC0283l abstractC0283l) {
        C16209l c16209l;
        if (abstractC0283l instanceof C16209l) {
            c16209l = (C16209l) abstractC0283l;
            int i = c16209l.f31718l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16209l.f31718l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16209l = new C16209l(this, abstractC0283l);
            }
        } else {
            c16209l = new C16209l(this, abstractC0283l);
        }
        Object objAdmob = c16209l.f31717l;
        int i2 = c16209l.f31718l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAdmob);
            C16534l c16534l = new C16534l(this.yandex, this.crashlytics, this.purchase, this.loadAd);
            c16209l.f31718l = 1;
            objAdmob = AbstractC8189l.admob(c16534l, c16209l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAdmob == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objAdmob);
        }
        this.purchase = true;
        return objAdmob;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamMix(mixId=");
        sb.append(this.yandex);
        sb.append(", mixEntityId=");
        sb.append(this.loadAd);
        sb.append(", options=");
        sb.append(this.crashlytics);
        sb.append(", displayName=");
        return AbstractC2812l.tapsense(sb, this.amazon, ')');
    }

    public C3086l(int i, String str, String str2, String str3, Map map) {
        str2 = (i & 2) != 0 ? null : str2;
        map = (i & 4) != 0 ? C14054l.f27396l : map;
        str3 = (i & 8) != 0 ? "" : str3;
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = map;
        this.amazon = str3;
        this.billing = "vk_mix_" + str + '_' + str2 + '_' + AbstractC16901l.m4210case(map.entrySet(), null, null, null, new C10949l(27), 31);
    }
}
