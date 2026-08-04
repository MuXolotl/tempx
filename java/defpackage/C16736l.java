package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: lٖۣٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16736l extends AbstractC7238l {
    public static final C2427l subscription;
    public long[][] adcel;
    public C8413l ads;
    public final AbstractC14384l[] firebase;
    public final C14823l metrica;
    public final AbstractC10759l[] remoteconfig;
    public final ArrayList smaato;
    public int startapp;
    public final ArrayList vip;

    static {
        C0935l c0935l = new C0935l();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        List list = Collections.EMPTY_LIST;
        C13708l c13708l2 = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        subscription = new C2427l("MergingMediaSource", new C9202l(c0935l), null, new C7828l(c2410l), C3852l.f7980private, C11470l.amazon);
    }

    public C16736l(AbstractC14384l... abstractC14384lArr) {
        C14823l c14823l = new C14823l(28);
        this.firebase = abstractC14384lArr;
        this.metrica = c14823l;
        this.vip = new ArrayList(Arrays.asList(abstractC14384lArr));
        this.startapp = -1;
        this.smaato = new ArrayList(abstractC14384lArr.length);
        for (int i = 0; i < abstractC14384lArr.length; i++) {
            this.smaato.add(new ArrayList());
        }
        this.remoteconfig = new AbstractC10759l[abstractC14384lArr.length];
        this.adcel = new long[0][];
        new HashMap();
        AbstractC12832l.loadAd(8, "expectedKeys");
        AbstractC12832l.loadAd(2, "expectedValuesPerKey");
        new C15423l(C6756l.loadAd(8)).f30138l = new C13636l();
    }

    @Override // defpackage.AbstractC14384l
    public final C2427l admob() {
        AbstractC14384l[] abstractC14384lArr = this.firebase;
        return abstractC14384lArr.length > 0 ? abstractC14384lArr[0].admob() : subscription;
    }

    @Override // defpackage.AbstractC7238l, defpackage.AbstractC14384l
    public final void isPro() throws C8413l {
        C8413l c8413l = this.ads;
        if (c8413l != null) {
            throw c8413l;
        }
        super.isPro();
    }

    @Override // defpackage.AbstractC14384l
    public final InterfaceC8782l loadAd(C5019l c5019l, InterfaceC3783l interfaceC3783l, long j) {
        AbstractC14384l[] abstractC14384lArr = this.firebase;
        int length = abstractC14384lArr.length;
        InterfaceC8782l[] interfaceC8782lArr = new InterfaceC8782l[length];
        AbstractC10759l[] abstractC10759lArr = this.remoteconfig;
        int iLoadAd = abstractC10759lArr[0].loadAd(c5019l.yandex);
        for (int i = 0; i < length; i++) {
            C5019l c5019lYandex = c5019l.yandex(abstractC10759lArr[i].smaato(iLoadAd));
            interfaceC8782lArr[i] = abstractC14384lArr[i].loadAd(c5019lYandex, interfaceC3783l, j - this.adcel[iLoadAd][i]);
            ((List) this.smaato.get(i)).add(new C7580l(c5019lYandex, interfaceC8782lArr[i]));
        }
        return new C5320l(this.metrica, this.adcel[iLoadAd], interfaceC8782lArr);
    }

    @Override // defpackage.AbstractC7238l
    public final void pro(Object obj, AbstractC14384l abstractC14384l, AbstractC10759l abstractC10759l) {
        Integer num = (Integer) obj;
        if (this.ads != null) {
            return;
        }
        if (this.startapp == -1) {
            this.startapp = abstractC10759l.admob();
        } else if (abstractC10759l.admob() != this.startapp) {
            this.ads = new C8413l();
            return;
        }
        int length = this.adcel.length;
        AbstractC10759l[] abstractC10759lArr = this.remoteconfig;
        if (length == 0) {
            this.adcel = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.startapp, abstractC10759lArr.length);
        }
        ArrayList arrayList = this.vip;
        arrayList.remove(abstractC14384l);
        abstractC10759lArr[num.intValue()] = abstractC10759l;
        if (arrayList.isEmpty()) {
            remoteconfig(abstractC10759lArr[0]);
        }
    }

    @Override // defpackage.AbstractC14384l
    public final void smaato(C7713l c7713l) {
        this.isPro = c7713l;
        this.subs = AbstractC15323l.ads(null);
        int i = 0;
        while (true) {
            AbstractC14384l[] abstractC14384lArr = this.firebase;
            if (i >= abstractC14384lArr.length) {
                return;
            }
            ad(Integer.valueOf(i), abstractC14384lArr[i]);
            i++;
        }
    }

    @Override // defpackage.AbstractC7238l, defpackage.AbstractC14384l
    public final void startapp() {
        super.startapp();
        Arrays.fill(this.remoteconfig, (Object) null);
        this.startapp = -1;
        this.ads = null;
        ArrayList arrayList = this.vip;
        arrayList.clear();
        Collections.addAll(arrayList, this.firebase);
    }

    @Override // defpackage.AbstractC14384l
    public final void subscription(C2427l c2427l) {
        this.firebase[0].subscription(c2427l);
    }

    @Override // defpackage.AbstractC7238l
    public final C5019l tapsense(Object obj, C5019l c5019l) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.smaato;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((C7580l) list.get(i)).yandex.equals(c5019l)) {
                return ((C7580l) ((List) arrayList.get(0)).get(i)).yandex;
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC14384l
    public final void vip(InterfaceC8782l interfaceC8782l) {
        C5320l c5320l = (C5320l) interfaceC8782l;
        int i = 0;
        while (true) {
            AbstractC14384l[] abstractC14384lArr = this.firebase;
            if (i >= abstractC14384lArr.length) {
                return;
            }
            List list = (List) this.smaato.get(i);
            boolean[] zArr = c5320l.f11442l;
            InterfaceC8782l[] interfaceC8782lArr = c5320l.f11443l;
            InterfaceC8782l interfaceC8782l2 = zArr[i] ? ((C12299l) interfaceC8782lArr[i]).f24375l : interfaceC8782lArr[i];
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((C7580l) list.get(i2)).loadAd.equals(interfaceC8782l2)) {
                    list.remove(i2);
                    break;
                }
            }
            abstractC14384lArr[i].vip(c5320l.f11442l[i] ? ((C12299l) interfaceC8782lArr[i]).f24375l : interfaceC8782lArr[i]);
            i++;
        }
    }

    @Override // defpackage.AbstractC14384l
    public final boolean yandex(C2427l c2427l) {
        AbstractC14384l[] abstractC14384lArr = this.firebase;
        return abstractC14384lArr.length > 0 && abstractC14384lArr[0].yandex(c2427l);
    }
}
