package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌَؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6367l implements InterfaceC4539l {
    public final InterfaceC1220l amazon = AbstractC9968l.crashlytics(3, new C9636l(26, this));
    public final C14740l crashlytics;

    public C6367l(C14740l c14740l) {
        this.crashlytics = c14740l;
    }

    @Override // defpackage.InterfaceC18742l
    public final List advert(String str) {
        List listAdcel = AbstractC17587l.adcel(new C11100l(new C17798l(4, new C9227l(this.crashlytics, str, null)), new C10351l(24)));
        if (listAdcel.isEmpty()) {
            return null;
        }
        return listAdcel;
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
        Iterator it = this.crashlytics.amazon.loadAd().iterator();
        if (!it.hasNext()) {
            return C5746l.f12138l;
        }
        C7168l c7168l = new C7168l(this, ((Integer) it.next()).intValue());
        if (!it.hasNext()) {
            return Collections.singleton(c7168l);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(c7168l);
        while (it.hasNext()) {
            linkedHashSet.add(new C7168l(this, ((Integer) it.next()).intValue()));
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC18742l
    public final Set names() {
        return (Set) this.amazon.getValue();
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean pro() {
        return true;
    }

    @Override // defpackage.InterfaceC18742l
    public final String signatures(String str) {
        C13545l c13545lYandex = this.crashlytics.yandex(str);
        if (c13545lYandex != null) {
            return c13545lYandex.toString();
        }
        return null;
    }
}
