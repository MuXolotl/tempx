package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؚۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10489l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10700l f21351l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21352l;

    public /* synthetic */ C10489l(C10700l c10700l, int i) {
        this.f21352l = i;
        this.f21351l = c10700l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f21352l;
        boolean z = false;
        C10700l c10700l = this.f21351l;
        switch (i) {
            case 0:
                InterfaceC0421l interfaceC0421l = (InterfaceC0421l) obj;
                if (AbstractC8576l.yandex(interfaceC0421l.mo531interface(), "waiting")) {
                    c10700l.f21708l = interfaceC0421l;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                C14541l c14541l = ((C0687l) ((InterfaceC11189l) obj)).f2172l;
                List listMetrica = (List) c10700l.f21708l;
                if (listMetrica != null) {
                    listMetrica.add(c14541l);
                } else {
                    listMetrica = AbstractC14055l.metrica(c14541l);
                }
                c10700l.f21708l = listMetrica;
                return EnumC8647l.f17805l;
        }
    }
}
