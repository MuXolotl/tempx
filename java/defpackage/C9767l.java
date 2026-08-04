package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍۘؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9767l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C11410l f19907l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19908l;

    public /* synthetic */ C9767l(C11410l c11410l, int i) {
        this.f19908l = i;
        this.f19907l = c11410l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f19908l;
        C11410l c11410l = this.f19907l;
        switch (i) {
            case 0:
                List listSingletonList = Collections.singletonList(AbstractC11145l.yandex(c11410l.f22977l.f20792l, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                return listSingletonList.isEmpty() ? C2782l.f6058l : new C2172l(0, listSingletonList);
            default:
                return c11410l.f22977l.f20792l.purchase();
        }
    }
}
