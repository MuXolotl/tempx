package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: lٌْؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13231l extends AbstractC5832l {
    public static final C13231l amazon = new C13231l(0);
    public static final C13231l purchase = new C13231l(1);
    public final /* synthetic */ int crashlytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13231l(int i) {
        super(2);
        this.crashlytics = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [lِّٙ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [lِّٙ] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [lٗؖؗ] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public static AbstractC15211l subs(AbstractC15211l abstractC15211l) {
        AbstractC18041l abstractC18041lLoadAd;
        InterfaceC1925l interfaceC1925lMo1339native = abstractC15211l.mo1339native();
        ?? r4 = 0;
        if (interfaceC1925lMo1339native instanceof C14811l) {
            C14811l c14811l = (C14811l) interfaceC1925lMo1339native;
            AbstractC4946l abstractC4946l = c14811l.f28980l;
            AbstractC4946l abstractC4946l2 = abstractC4946l.yandex() == 2 ? abstractC4946l : null;
            AbstractC14318l abstractC14318lMo3847class = (abstractC4946l2 == null || (abstractC18041lLoadAd = abstractC4946l2.loadAd()) == null) ? null : abstractC18041lLoadAd.mo3847class();
            if (c14811l.f28979l == null) {
                Collection collectionYandex = c14811l.yandex();
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(collectionYandex, 10));
                Iterator it = collectionYandex.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC18041l) it.next()).mo3847class());
                }
                c14811l.f28979l = new C2314l(abstractC4946l, new C12426l(1, arrayList), (InterfaceC16902l) r4, 8);
            }
            return new C16597l(1, c14811l.f28979l, abstractC14318lMo3847class, abstractC15211l.mo1340package(), abstractC15211l.mo1342throw(), 32);
        }
        if (!(interfaceC1925lMo1339native instanceof C11794l) || !abstractC15211l.mo1342throw()) {
            return abstractC15211l;
        }
        ?? r0 = (C11794l) interfaceC1925lMo1339native;
        LinkedHashSet linkedHashSet = r0.f23607l;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            arrayList2.add(AbstractC12008l.mopub((AbstractC18041l) it2.next(), true));
            z = true;
        }
        if (z) {
            AbstractC18041l abstractC18041l = r0.f23608l;
            AbstractC14318l abstractC14318lMopub = abstractC18041l != null ? AbstractC12008l.mopub(abstractC18041l, true) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            C11794l c11794l = new C11794l(linkedHashSet2);
            c11794l.f23608l = abstractC14318lMopub;
            r4 = c11794l;
        }
        if (r4 != 0) {
            r0 = r4;
        }
        return r0.loadAd();
    }

    public AbstractC14318l admob(InterfaceC13789l interfaceC13789l) {
        AbstractC14318l abstractC14318lSubs;
        if (!(interfaceC13789l instanceof AbstractC18041l)) {
            C8339l.metrica("Failed requirement.");
            return null;
        }
        AbstractC14318l abstractC14318lMo3847class = ((AbstractC18041l) interfaceC13789l).mo3847class();
        if (abstractC14318lMo3847class instanceof AbstractC15211l) {
            abstractC14318lSubs = subs((AbstractC15211l) abstractC14318lMo3847class);
        } else {
            if (!(abstractC14318lMo3847class instanceof AbstractC4317l)) {
                C18725l.billing();
                return null;
            }
            AbstractC4317l abstractC4317l = (AbstractC4317l) abstractC14318lMo3847class;
            AbstractC15211l abstractC15211l = abstractC4317l.f8856l;
            AbstractC15211l abstractC15211l2 = abstractC4317l.f8857l;
            AbstractC15211l abstractC15211lSubs = subs(abstractC15211l2);
            AbstractC15211l abstractC15211lSubs2 = subs(abstractC15211l);
            abstractC14318lSubs = (abstractC15211lSubs == abstractC15211l2 && abstractC15211lSubs2 == abstractC15211l) ? abstractC14318lMo3847class : AbstractC3605l.subs(abstractC15211lSubs, abstractC15211lSubs2);
        }
        AbstractC18041l abstractC18041lAmazon = AbstractC5170l.amazon(abstractC14318lMo3847class);
        return AbstractC5170l.purchase(abstractC14318lSubs, abstractC18041lAmazon != null ? admob(abstractC18041lAmazon) : null);
    }

    @Override // defpackage.AbstractC5832l
    public final InterfaceC13789l mopub(InterfaceC13789l interfaceC13789l) {
        switch (this.crashlytics) {
            case 0:
                return interfaceC13789l;
            default:
                return admob(interfaceC13789l);
        }
    }
}
