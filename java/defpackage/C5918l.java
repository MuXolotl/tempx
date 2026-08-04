package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘۘۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5918l implements InterfaceC4539l {
    public final /* synthetic */ C8309l crashlytics;

    public C5918l(C8309l c8309l) {
        this.crashlytics = c8309l;
    }

    @Override // defpackage.InterfaceC18742l
    public final List advert(String str) {
        List listSmaato = this.crashlytics.smaato(str);
        if (listSmaato.isEmpty()) {
            return null;
        }
        return listSmaato;
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
        return this.crashlytics.admob().entrySet();
    }

    @Override // defpackage.InterfaceC18742l
    public final Set names() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        C8309l c8309l = this.crashlytics;
        int size = c8309l.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(c8309l.billing(i));
        }
        return DesugarCollections.unmodifiableSet(treeSet);
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean pro() {
        return true;
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
