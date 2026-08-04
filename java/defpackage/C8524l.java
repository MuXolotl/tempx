package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌؓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8524l implements InterfaceC4539l {
    public final boolean billing;
    public final InterfaceC4539l crashlytics;
    public final C0090l amazon = new C0090l(13);
    public final LinkedHashSet purchase = new LinkedHashSet();

    public C8524l(InterfaceC4539l interfaceC4539l) {
        this.crashlytics = interfaceC4539l;
        this.billing = interfaceC4539l.pro();
    }

    @Override // defpackage.InterfaceC18742l
    public final List advert(String str) {
        if (this.purchase.contains(str)) {
            return null;
        }
        C0090l c0090l = this.amazon;
        return ((Map) c0090l.f833l).containsKey(str) ? c0090l.advert(str) : this.crashlytics.advert(str);
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean contains(String str) {
        return advert("X-Req-Hash") != null;
    }

    @Override // defpackage.InterfaceC18742l
    public final /* bridge */ void isVip(Function2 function2) {
        AbstractC0653l.amazon(this, function2);
    }

    @Override // defpackage.InterfaceC18742l
    public final Set mopub() {
        LinkedHashSet linkedHashSetMopub = AbstractC9905l.mopub(this.crashlytics.mopub(), this.amazon.m273l().mopub());
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetMopub) {
            if (!this.purchase.contains(((Map.Entry) obj).getKey())) {
                arrayList.add(obj);
            }
        }
        return AbstractC16901l.m4229l(arrayList);
    }

    @Override // defpackage.InterfaceC18742l
    public final Set names() {
        return AbstractC9905l.purchase(AbstractC9905l.mopub(this.crashlytics.names(), ((Map) this.amazon.f833l).keySet()), this.purchase);
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean pro() {
        return this.billing;
    }

    @Override // defpackage.InterfaceC18742l
    public final String signatures(String str) {
        List listAdvert = advert(str);
        if (listAdvert != null) {
            return (String) AbstractC16901l.m4217extends(listAdvert);
        }
        return null;
    }
}
