package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lَ۠ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10610l implements InterfaceC16088l, InterfaceC17842l {
    public final C11919l admob;
    public final ArrayList amazon;
    public final C11919l billing;
    public final C10740l crashlytics;
    public final C8250l loadAd;
    public final C11919l mopub;
    public final C17928l purchase = new C17928l();
    public final /* synthetic */ C16793l yandex;

    public C10610l(ArrayList arrayList, C16793l c16793l, C8250l c8250l, C10740l c10740l) {
        this.yandex = c16793l;
        this.loadAd = c8250l;
        this.crashlytics = c10740l;
        this.amazon = new ArrayList(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C7933l) it.next()).yandex);
        }
        this.billing = new C11919l(AbstractC0509l.billing(arrayList2));
        this.mopub = new C11919l((Object) 0);
        C17928l c17928l = this.purchase;
        InterfaceC16588l interfaceC16588lSerializer = InterfaceC13160l.Companion.serializer();
        C6564l c6564l = C6564l.INSTANCE;
        this.admob = AbstractC0545l.yandex(this, c17928l, interfaceC16588lSerializer, new C9577l(0, c6564l), "DefaultChildStack", false, new C14959l(2, this, C10610l.class, "childFactory", "childFactory(Lbruhcollective/itaysonlab/vkx/decompose/components/pick_audios/VkxPickAudiosSheetComponent$Config;Lcom/arkivanov/decompose/ComponentContext;)Lbruhcollective/itaysonlab/vkx/decompose/components/pick_audios/PickAudiosSheetComponent$Child;", 0, 0, 15));
    }

    @Override // defpackage.InterfaceC17842l
    public final C10023l amazon() {
        return this.yandex.loadAd;
    }

    @Override // defpackage.InterfaceC17842l
    public final C4917l billing() {
        return this.yandex.purchase;
    }

    @Override // defpackage.InterfaceC17842l
    public final C6921l crashlytics() {
        return this.yandex.crashlytics;
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC12356l loadAd() {
        return this.yandex.yandex;
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC9573l purchase() {
        return this.yandex.amazon;
    }

    public final void yandex(C7933l c7933l) {
        AbstractC18082l abstractC18082lAd;
        C11919l c11919l = this.billing;
        AbstractC18082l abstractC18082l = (AbstractC18082l) c11919l.admob();
        String str = c7933l.yandex;
        boolean zContains = abstractC18082l.contains(str);
        ArrayList arrayList = this.amazon;
        if (zContains) {
            arrayList.remove(c7933l);
            abstractC18082lAd = (AbstractC18082l) c11919l.admob();
            int iIndexOf = abstractC18082lAd.indexOf(str);
            if (iIndexOf != -1) {
                abstractC18082lAd = abstractC18082lAd.signatures(iIndexOf);
            }
        } else {
            arrayList.add(c7933l);
            abstractC18082lAd = ((AbstractC18082l) c11919l.admob()).ad(str);
        }
        c11919l.subscription(abstractC18082lAd);
        this.mopub.subscription(Integer.valueOf(((AbstractC18082l) c11919l.admob()).pro()));
    }
}
