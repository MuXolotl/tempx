package defpackage;

import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِؔۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2558l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2397l f5564l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5565l;

    public /* synthetic */ C2558l(C2397l c2397l, int i) {
        this.f5565l = i;
        this.f5564l = c2397l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f5565l;
        C2397l c2397l = this.f5564l;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (c2397l.isVip()) {
                    if (str != null) {
                        c2397l.subs(Collections.singletonMap("success_token", str));
                    } else {
                        c2397l.subs(C14054l.f27396l);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                c2397l.subs((Map) obj);
                return Unit.INSTANCE;
            case 2:
                c2397l.subs((Map) obj);
                return Unit.INSTANCE;
            default:
                Unit unit = Unit.INSTANCE;
                c2397l.subs(unit);
                return unit;
        }
    }
}
