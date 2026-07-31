package defpackage;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍّٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9577l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f19516l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19517l;

    public /* synthetic */ C9577l(int i, Object obj) {
        this.f19517l = i;
        this.f19516l = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f19517l;
        Object obj = this.f19516l;
        switch (i) {
            case 0:
                return Collections.singletonList(obj);
            default:
                return obj;
        }
    }
}
