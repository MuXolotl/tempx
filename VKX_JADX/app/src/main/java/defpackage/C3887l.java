package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؖؔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C3887l implements InterfaceC8393l, InterfaceC2244l, InterfaceC3136l {
    public static final C3887l INSTANCE = new C3887l();
    public static final /* synthetic */ InterfaceC1220l loadAd;
    public static final String yandex;

    static {
        VKXApplication.Companion companion = VKXApplication.f36628l;
        yandex = VKXApplication.Companion.loadAd(R.string.cache_track_selector_all);
        loadAd = AbstractC9968l.crashlytics(2, new C7703l(23));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2244l
    public final Object amazon(AbstractC0283l abstractC0283l) {
        C12936l c12936l;
        if (abstractC0283l instanceof C12936l) {
            c12936l = (C12936l) abstractC0283l;
            int i = c12936l.f25386l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12936l.f25386l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12936l = new C12936l(this, abstractC0283l);
            }
        } else {
            c12936l = new C12936l(this, abstractC0283l);
        }
        Object objBilling = c12936l.f25385l;
        int i2 = c12936l.f25386l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objBilling);
            c12936l.f25386l = 1;
            C6336l c6336l = C6336l.yandex;
            objBilling = C6336l.billing(new C8578l(6), c12936l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objBilling == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objBilling);
        }
        Iterable iterable = (Iterable) objBilling;
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
        return yandex;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C3887l);
    }

    @Override // defpackage.InterfaceC17817l
    public final String getId() {
        return "cache_all";
    }

    public final int hashCode() {
        return 1153179443;
    }

    @Override // defpackage.InterfaceC2244l
    public final Object loadAd(List list, AbstractC0283l abstractC0283l) {
        return AbstractC12900l.yandex(list, abstractC0283l);
    }

    @Override // defpackage.InterfaceC17817l
    public final String mopub() {
        return null;
    }

    public final InterfaceC16588l serializer() {
        return (InterfaceC16588l) loadAd.getValue();
    }

    public final String toString() {
        return "AllTracks";
    }
}
