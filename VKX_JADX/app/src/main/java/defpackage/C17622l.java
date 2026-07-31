package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17622l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16760l f34291l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34292l;

    public /* synthetic */ C17622l(C16760l c16760l, int i) {
        this.f34292l = i;
        this.f34291l = c16760l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f34292l;
        C16760l c16760l = this.f34291l;
        switch (i) {
            case 0:
                C14823l c14823l = ((C7757l) c16760l.f32766l.f20463l).smaato;
                String str = c16760l.f7826l.yandex.yandex;
                c14823l.getClass();
                return AbstractC8676l.subscription(new ArrayList());
            case 1:
                c16760l.f32763l.getClass();
                return new ArrayList(AbstractC14055l.billing(C2580l.f5619l, 10));
            default:
                HashMap map = new HashMap();
                C2278l c2278l = c16760l.f32764l;
                InterfaceC13922l interfaceC13922l = C16760l.f32761l[0];
                for (Map.Entry entry : ((Map) c2278l.invoke()).entrySet()) {
                    String str2 = (String) entry.getKey();
                    C5222l c5222l = (C5222l) entry.getValue();
                    C8353l c8353lCrashlytics = C8353l.crashlytics(str2);
                    C11906l c11906l = c5222l.loadAd;
                    EnumC4474l enumC4474l = (EnumC4474l) c11906l.crashlytics;
                    int iOrdinal = enumC4474l.ordinal();
                    if (iOrdinal == 2) {
                        map.put(c8353lCrashlytics, c8353lCrashlytics);
                    } else if (iOrdinal == 5) {
                        String str3 = (String) c11906l.admob;
                        if (enumC4474l != EnumC4474l.MULTIFILE_CLASS_PART) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            map.put(c8353lCrashlytics, C8353l.crashlytics(str3));
                        }
                    }
                }
                return map;
        }
    }
}
