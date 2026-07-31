package defpackage;

import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕۣؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4908l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f10003l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1332l f10004l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f10005l;

    public /* synthetic */ C4908l(C1332l c1332l, long j, int i) {
        this.f10005l = i;
        this.f10004l = c1332l;
        this.f10003l = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f10005l;
        C1332l c1332l = this.f10004l;
        switch (i) {
            case 0:
                realm_value_t realm_value_tVar = ((C14864l) obj).yandex;
                long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
                int i2 = AbstractC9795l.yandex;
                realmcJNI.realm_set_value(ptr$cinterop_release, this.f10003l, realm_value_tVar.yandex, realm_value_tVar, false);
                break;
            default:
                realm_value_t realm_value_tVar2 = ((C14864l) obj).yandex;
                long ptr$cinterop_release2 = c1332l.f3422l.getPtr$cinterop_release();
                int i3 = AbstractC9795l.yandex;
                realmcJNI.realm_set_value(ptr$cinterop_release2, this.f10003l, realm_value_tVar2.yandex, realm_value_tVar2, false);
                break;
        }
        return Unit.INSTANCE;
    }
}
