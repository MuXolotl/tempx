package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٟٗۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17317l implements InterfaceC5966l {
    public final String crashlytics;
    public final long loadAd;
    public final int yandex;

    public C17317l(long j, int i, String str) {
        this.yandex = i;
        this.loadAd = j;
        this.crashlytics = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17317l)) {
            return false;
        }
        C17317l c17317l = (C17317l) obj;
        return this.yandex == c17317l.yandex && this.loadAd == c17317l.loadAd && AbstractC8576l.yandex(this.crashlytics, c17317l.crashlytics);
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        long j = this.loadAd;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.crashlytics;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC5966l
    public final Object loadAd(int i, int i2, AbstractC0283l abstractC0283l) {
        C1586l c1586l;
        if (abstractC0283l instanceof C1586l) {
            c1586l = (C1586l) abstractC0283l;
            int i3 = c1586l.f3912l;
            if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1586l.f3912l = i3 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1586l = new C1586l(this, abstractC0283l);
            }
        } else {
            c1586l = new C1586l(this, abstractC0283l);
        }
        C1586l c1586l2 = c1586l;
        Object objLoadAd = c1586l2.f3911l;
        int i4 = c1586l2.f3912l;
        if (i4 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            C7644l c7644lLoadAd = AbstractC16584l.loadAd();
            Long l = new Long(this.loadAd);
            Integer num = new Integer(this.yandex);
            c1586l2.f3912l = 1;
            objLoadAd = AbstractC14312l.loadAd(c7644lLoadAd, i2, 200, l, num, c1586l2, 16360);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i4 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objLoadAd);
        }
        return ((C4363l) AbstractC10802l.subs((AbstractC14237l) objLoadAd)).loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Playlist(id=");
        sb.append(this.yandex);
        sb.append(", ownerId=");
        sb.append(this.loadAd);
        sb.append(", accessKey=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }

    @Override // defpackage.InterfaceC5966l
    public final Object yandex(List list, C11789l c11789l) {
        C7644l c7644lLoadAd = AbstractC16584l.loadAd();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14654l c14654l = (C14654l) it.next();
            arrayList.add(new C16832l(c14654l.yandex, c14654l.loadAd, -1));
        }
        Object objFirebase = AbstractC14312l.firebase(c7644lLoadAd, this.yandex, this.loadAd, arrayList, c11789l);
        return objFirebase == EnumC9342l.f19165l ? objFirebase : Unit.INSTANCE;
    }
}
