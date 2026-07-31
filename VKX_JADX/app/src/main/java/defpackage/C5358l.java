package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘُؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5358l implements InterfaceC14665l {
    public final /* synthetic */ C18708l crashlytics;

    public C5358l(C18708l c18708l) {
        this.crashlytics = c18708l;
    }

    @Override // defpackage.InterfaceC18742l
    public final List advert(String str) {
        return this.crashlytics.loadAd(str);
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean contains(String str) {
        return this.crashlytics.loadAd("a") != null;
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean isEmpty() {
        return this.crashlytics.isEmpty();
    }

    @Override // defpackage.InterfaceC18742l
    public final /* bridge */ void isVip(Function2 function2) {
        AbstractC0653l.amazon(this, function2);
    }

    @Override // defpackage.InterfaceC18742l
    public final Set mopub() {
        return this.crashlytics.mopub();
    }

    @Override // defpackage.InterfaceC18742l
    public final Set names() {
        return this.crashlytics.names();
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean pro() {
        return true;
    }

    @Override // defpackage.InterfaceC18742l
    public final String signatures(String str) {
        List listLoadAd = this.crashlytics.loadAd("a");
        if (listLoadAd == null) {
            return null;
        }
        return listLoadAd.isEmpty() ? "" : (String) AbstractC16901l.m4231native(listLoadAd);
    }
}
