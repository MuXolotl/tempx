package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lؕۘۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3590l implements InterfaceC5966l {
    public static final C3590l yandex = new C3590l();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C3590l);
    }

    public final int hashCode() {
        return -1570225454;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC5966l
    public final Object loadAd(int i, int i2, AbstractC0283l abstractC0283l) {
        C10592l c10592l;
        if (abstractC0283l instanceof C10592l) {
            c10592l = (C10592l) abstractC0283l;
            int i3 = c10592l.f21505l;
            if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10592l.f21505l = i3 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10592l = new C10592l(this, abstractC0283l);
            }
        } else {
            c10592l = new C10592l(this, abstractC0283l);
        }
        C10592l c10592l2 = c10592l;
        Object objLoadAd = c10592l2.f21504l;
        int i4 = c10592l2.f21505l;
        if (i4 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            C7644l c7644lLoadAd = AbstractC16584l.loadAd();
            Long l = new Long(((C4645l) AbstractC16584l.loadAd().f15735l).yandex);
            c10592l2.f21505l = 1;
            objLoadAd = AbstractC14312l.loadAd(c7644lLoadAd, i2, 1000, l, null, c10592l2, 16376);
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
        return "Library";
    }

    @Override // defpackage.InterfaceC5966l
    public final Object yandex(List list, C11789l c11789l) {
        int i;
        C7644l c7644lLoadAd = AbstractC16584l.loadAd();
        C17464l c17464l = new C17464l("execute", C14823l.f29008l);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            C14654l c14654l = (C14654l) it.next();
            C0099l c0099l = new C0099l(1);
            c0099l.loadAd(c14654l.yandex, "audio_id");
            c0099l.crashlytics(c14654l.loadAd);
            Unit unit = Unit.INSTANCE;
            arrayList.add(new C8634l("audio.delete", c0099l, 8));
        }
        arrayList.add(new C3316l(26, new C14513l(i, 22, (byte) 0)));
        Unit unit2 = Unit.INSTANCE;
        c17464l.yandex("code", AbstractC16901l.m4210case(arrayList, "\n\n", null, null, null, 62));
        Object objBilling = c7644lLoadAd.billing(c17464l, c11789l);
        return objBilling == EnumC9342l.f19165l ? objBilling : Unit.INSTANCE;
    }
}
