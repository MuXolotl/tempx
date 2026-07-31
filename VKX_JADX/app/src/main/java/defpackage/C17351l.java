package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lٗۘؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C17351l implements InterfaceC8393l, InterfaceC2244l, InterfaceC3136l {
    public static final C2052l Companion = new C2052l();
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C17351l(int i, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C1098l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = (i & 2) == 0 ? "" : str2;
        if ((i & 4) == 0) {
            this.crashlytics = AbstractC14814l.startapp("cps_al_", str);
        } else {
            this.crashlytics = str3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2244l
    public final Object amazon(AbstractC0283l abstractC0283l) {
        C12486l c12486l;
        if (abstractC0283l instanceof C12486l) {
            c12486l = (C12486l) abstractC0283l;
            int i = c12486l.f24627l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12486l.f24627l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12486l = new C12486l(this, abstractC0283l);
            }
        } else {
            c12486l = new C12486l(this, abstractC0283l);
        }
        Object objSubscription = c12486l.f24626l;
        int i2 = c12486l.f24627l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objSubscription);
            C11485l c11485l = C11485l.f23075l;
            c12486l.f24627l = 1;
            objSubscription = c11485l.subscription(this.yandex, c12486l);
            Object obj = EnumC9342l.f19165l;
            if (objSubscription == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objSubscription);
        }
        Iterable iterable = (Iterable) objSubscription;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC16676l.mopub((AudioTrack) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC17817l
    public final boolean billing() {
        return false;
    }

    @Override // defpackage.InterfaceC17817l
    public final String crashlytics() {
        return this.loadAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17351l)) {
            return false;
        }
        C17351l c17351l = (C17351l) obj;
        return AbstractC8576l.yandex(this.yandex, c17351l.yandex) && AbstractC8576l.yandex(this.loadAd, c17351l.loadAd);
    }

    @Override // defpackage.InterfaceC17817l
    public final String getId() {
        return this.crashlytics;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC2244l
    public final Object loadAd(List list, AbstractC0283l abstractC0283l) {
        return AbstractC12900l.yandex(list, abstractC0283l);
    }

    @Override // defpackage.InterfaceC17817l
    public final String mopub() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Album(uid=");
        sb.append(this.yandex);
        sb.append(", displayName=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }

    public C17351l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = "cps_al_".concat(str);
    }
}
