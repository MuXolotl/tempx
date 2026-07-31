package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lؑؓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0061l implements InterfaceC18672l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2343l f960l = AbstractC3124l.loadAd(null, new C4936l(0, this, AbstractC7572l.class, "computeAbsentArguments", "computeAbsentArguments(Lkotlin/reflect/jvm/internal/ReflectKCallable;)[Ljava/lang/Object;", 1, 0, 28));

    @Override // defpackage.InterfaceC6902l
    public final Object isVip(Map map) throws C10756l {
        Object objLoadAd;
        if (!AbstractC7572l.mopub(this)) {
            return AbstractC7572l.yandex(this, map, null);
        }
        List<AbstractC9707l> parameters = getParameters();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(parameters, 10));
        for (AbstractC9707l abstractC9707l : parameters) {
            if (map.containsKey(abstractC9707l)) {
                objLoadAd = map.get(abstractC9707l);
                if (objLoadAd == null) {
                    C11983l.purchase(41, abstractC9707l, "Annotation argument value cannot be null (");
                    return null;
                }
            } else if (abstractC9707l.mo1108private()) {
                objLoadAd = null;
            } else {
                if (!abstractC9707l.mo1106extends()) {
                    C1759l.ads(abstractC9707l, "No argument provided for a required parameter: ");
                    return null;
                }
                objLoadAd = AbstractC7572l.loadAd(abstractC9707l.mo1109synchronized());
            }
            arrayList.add(objLoadAd);
        }
        InterfaceC16148l interfaceC16148lStartapp = startapp();
        if (interfaceC16148lStartapp == null) {
            C11467l.Signature(this, "This callable does not support a default call: ");
            return null;
        }
        try {
            return interfaceC16148lStartapp.amazon(arrayList.toArray(new Object[0]));
        } catch (IllegalAccessException e) {
            throw new C10756l(e);
        }
    }

    public final Object[] premium() {
        return (Object[]) ((Object[]) this.f960l.invoke()).clone();
    }

    public final Object pro(Object... objArr) {
        try {
            return isPro().amazon(objArr);
        } catch (IllegalAccessException e) {
            throw new C10756l(e);
        }
    }
}
