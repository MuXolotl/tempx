package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lِِٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11779l implements InterfaceC13280l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C13708l f23578l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final LinkedHashMap f23579l = new LinkedHashMap();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f23580l = false;

    static {
        C9258l c9258l = AbstractC1186l.f3181l;
        f23578l = C13708l.f26763l;
    }

    public final List adcel(String str) {
        List list = (List) this.f23579l.get(str);
        return list == null ? f23578l : list;
    }

    public final InterfaceC15476l admob(String str) {
        if (str == null || AbstractC1315l.purchase(str)) {
            C8339l.metrica("id cannot be null or the empty string");
            return null;
        }
        this.f23579l.remove(str);
        return this;
    }

    public final AbstractC1186l ads(String str) {
        List list = (List) this.f23579l.get(str);
        return list == null ? C13708l.f26763l : AbstractC1186l.Signature(list);
    }

    @Override // defpackage.InterfaceC15476l
    public final int amazon() {
        startapp().size();
        Iterator itIsPro = isPro();
        int i = 0;
        while (true) {
            C5191l c5191l = (C5191l) itIsPro;
            if (!c5191l.hasNext()) {
                return i;
            }
            i++;
            c5191l.next();
        }
    }

    public void billing(InterfaceC4656l interfaceC4656l) {
        if (interfaceC4656l == null) {
            return;
        }
        String id = interfaceC4656l.getId();
        LinkedHashMap linkedHashMap = this.f23579l;
        List list = (List) linkedHashMap.get(id);
        if (list != null) {
            list.add(interfaceC4656l);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(interfaceC4656l);
        linkedHashMap.put(interfaceC4656l.getId(), arrayList);
        interfaceC4656l.startapp();
    }

    @Override // defpackage.InterfaceC15476l
    public AbstractC1186l crashlytics(EnumC17969l enumC17969l) {
        return AbstractC1186l.Signature(adcel("COVER_ART"));
    }

    @Override // defpackage.InterfaceC15476l
    public InterfaceC15476l firebase(EnumC17969l enumC17969l, String... strArr) {
        remoteconfig(yandex(enumC17969l, strArr));
        return this;
    }

    @Override // defpackage.InterfaceC15476l
    public boolean isEmpty() {
        return this.f23579l.size() == 0;
    }

    @Override // defpackage.InterfaceC15476l
    public final Iterator isPro() {
        return new C5191l(this.f23579l.entrySet().iterator());
    }

    @Override // defpackage.InterfaceC15476l
    public final boolean loadAd() {
        return this.f23580l;
    }

    @Override // defpackage.InterfaceC15476l
    public InterfaceC15476l metrica(AbstractC5859l abstractC5859l) {
        AbstractC6745l.loadAd(abstractC5859l, "artwork");
        remoteconfig(smaato(abstractC5859l));
        return this;
    }

    @Override // defpackage.InterfaceC15476l
    public boolean mopub(EnumC17969l enumC17969l) {
        return adcel(enumC17969l.name()).size() != 0;
    }

    @Override // defpackage.InterfaceC13280l
    public void remoteconfig(InterfaceC4656l interfaceC4656l) {
        if (interfaceC4656l == null) {
            return;
        }
        String id = interfaceC4656l.getId();
        LinkedHashMap linkedHashMap = this.f23579l;
        List list = (List) linkedHashMap.get(id);
        if (list != null) {
            list.set(0, interfaceC4656l);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(interfaceC4656l);
        linkedHashMap.put(interfaceC4656l.getId(), arrayList);
        interfaceC4656l.startapp();
    }

    public final ArrayList startapp() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f23579l.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                arrayList.add((InterfaceC4656l) it2.next());
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC17238l subs(EnumC17969l enumC17969l) {
        return purchase(enumC17969l);
    }

    public final AbstractC17238l subscription(String str) {
        List listAdcel = adcel(str);
        return listAdcel.size() > 0 ? AbstractC17238l.amazon(((InterfaceC4656l) listAdcel.get(0)).toString()) : C1972l.f4482l;
    }

    public String toString() {
        StringBuilder sbAd = AbstractC5020l.ad("Tag content:\n");
        Iterator itIsPro = isPro();
        while (true) {
            C5191l c5191l = (C5191l) itIsPro;
            if (!c5191l.hasNext()) {
                return sbAd.toString().substring(0, sbAd.length() - 1);
            }
            InterfaceC4656l interfaceC4656l = (InterfaceC4656l) c5191l.next();
            sbAd.append("\t");
            sbAd.append(interfaceC4656l.getId());
            sbAd.append(":");
            sbAd.append(interfaceC4656l.toString());
            sbAd.append("\n");
        }
    }
}
