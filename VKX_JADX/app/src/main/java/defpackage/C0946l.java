package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍؒ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0946l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f2627l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f2628l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2629l;

    public C0946l(C4975l c4975l, C5073l c5073l, int i) {
        this.f2629l = 2;
        this.f2628l = c5073l;
        this.f2627l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f2629l;
        int i2 = this.f2627l;
        Object obj2 = this.f2628l;
        switch (i) {
            case 0:
                realm_value_t realm_value_tVar = ((C14864l) obj).yandex;
                long ptr$cinterop_release = ((LongPointerWrapper) ((C4619l) obj2).f9374l).getPtr$cinterop_release();
                int i3 = AbstractC9795l.yandex;
                realmcJNI.realm_list_insert(ptr$cinterop_release, i2, realm_value_tVar.yandex, realm_value_tVar);
                break;
            case 1:
                realm_value_t realm_value_tVar2 = ((C14864l) obj).yandex;
                long ptr$cinterop_release2 = ((LongPointerWrapper) ((C4619l) obj2).f9374l).getPtr$cinterop_release();
                int i4 = AbstractC9795l.yandex;
                realmcJNI.realm_list_set(ptr$cinterop_release2, i2, realm_value_tVar2.yandex, realm_value_tVar2);
                break;
            default:
                C5073l c5073l = (C5073l) obj2;
                InterfaceC12244l interfaceC12244l = c5073l.f11086l;
                C18364l c18364l = (C18364l) interfaceC12244l.getValue();
                ArrayList arrayList = new ArrayList(((C18364l) interfaceC12244l.getValue()).f35876l);
                arrayList.set(i2, (C7117l) obj);
                Unit unit = Unit.INSTANCE;
                c5073l.setValue(C18364l.loadAd(c18364l, false, false, 0, 0, arrayList, 47));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C0946l(C4619l c4619l, int i, int i2) {
        this.f2629l = i2;
        this.f2628l = c4619l;
        this.f2627l = i;
    }
}
