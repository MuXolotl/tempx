package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lٌؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C8547l implements InterfaceC8393l, InterfaceC2244l, InterfaceC3136l {
    public static final C0226l Companion = new C0226l();
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C8547l(String str, int i, String str2) {
        if ((i & 1) == 0) {
            C16287l.yandex.getClass();
            str = C16287l.amazon();
        }
        this.yandex = str;
        if ((i & 2) == 0) {
            this.loadAd = "cps_manual_library";
        } else {
            this.loadAd = str2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2244l
    public final Object amazon(AbstractC0283l abstractC0283l) {
        C6178l c6178l;
        if (abstractC0283l instanceof C6178l) {
            c6178l = (C6178l) abstractC0283l;
            int i = c6178l.f13024l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6178l.f13024l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6178l = new C6178l(this, abstractC0283l);
            }
        } else {
            c6178l = new C6178l(this, abstractC0283l);
        }
        Object objMetrica = c6178l.f13023l;
        int i2 = c6178l.f13024l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objMetrica);
            C1083l c1083l = C1083l.f2987l;
            c6178l.f13024l = 1;
            objMetrica = C1083l.metrica(c1083l, 0, 0, c6178l, 15);
            Object obj = EnumC9342l.f19165l;
            if (objMetrica == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objMetrica);
        }
        Iterable iterable = (Iterable) objMetrica;
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
        return this.yandex;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8547l) && AbstractC8576l.yandex(this.yandex, ((C8547l) obj).yandex);
    }

    @Override // defpackage.InterfaceC17817l
    public final String getId() {
        return this.loadAd;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
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
        return AbstractC2812l.tapsense(new StringBuilder("ManualLibrary(displayName="), this.yandex, ')');
    }

    public C8547l() {
        C16287l.yandex.getClass();
        this.yandex = C16287l.amazon();
        this.loadAd = "cps_manual_library";
    }
}
