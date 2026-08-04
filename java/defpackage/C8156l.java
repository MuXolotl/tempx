package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lًٝۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C8156l implements InterfaceC8393l, InterfaceC2244l, InterfaceC3136l {
    public static final C0201l Companion = new C0201l();
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C8156l(String str, int i, String str2) {
        if ((i & 1) == 0) {
            C16287l.yandex.getClass();
            str = C16287l.amazon();
        }
        this.yandex = str;
        if ((i & 2) == 0) {
            this.loadAd = "cps_library";
        } else {
            this.loadAd = str2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2244l
    public final Object amazon(AbstractC0283l abstractC0283l) {
        C11908l c11908l;
        if (abstractC0283l instanceof C11908l) {
            c11908l = (C11908l) abstractC0283l;
            int i = c11908l.f23752l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11908l.f23752l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11908l = new C11908l(this, abstractC0283l);
            }
        } else {
            c11908l = new C11908l(this, abstractC0283l);
        }
        Object objTapsense = c11908l.f23751l;
        int i2 = c11908l.f23752l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objTapsense);
            C16287l.yandex.getClass();
            long jCrashlytics = C16287l.crashlytics();
            c11908l.f23752l = 1;
            objTapsense = C11485l.f23075l.tapsense(-1337, jCrashlytics, 0, 0, c11908l);
            Object obj = EnumC9342l.f19165l;
            if (objTapsense == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objTapsense);
        }
        Iterable iterable = (Iterable) objTapsense;
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
        return (obj instanceof C8156l) && AbstractC8576l.yandex(this.yandex, ((C8156l) obj).yandex);
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
        return AbstractC2812l.tapsense(new StringBuilder("Library(displayName="), this.yandex, ')');
    }

    public C8156l() {
        C16287l.yandex.getClass();
        this.yandex = C16287l.amazon();
        this.loadAd = "cps_library";
    }
}
