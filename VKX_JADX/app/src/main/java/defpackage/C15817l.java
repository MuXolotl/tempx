package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًٕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15817l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C15284l f31058l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31059l;

    public /* synthetic */ C15817l(C15284l c15284l, int i) {
        this.f31059l = i;
        this.f31058l = c15284l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f31059l;
        C15284l c15284l = this.f31058l;
        switch (i) {
            case 0:
                return AbstractC16901l.m4229l(AbstractC17587l.adcel(AbstractC17587l.startapp(AbstractC17587l.smaato(AbstractC8669l.ads(c15284l.metrica.yandex.getDeclaredClasses()), C1490l.f3705l), C1490l.f3719l)));
            case 1:
                List listYandex = c15284l.metrica.yandex();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listYandex) {
                    if (((C0865l) obj).yandex.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(arrayList, 10));
                if (iFirebase < 16) {
                    iFirebase = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((C0865l) obj2).crashlytics(), obj2);
                }
                return linkedHashMap;
            default:
                return AbstractC9905l.mopub(c15284l.loadAd(), c15284l.mopub());
        }
    }
}
