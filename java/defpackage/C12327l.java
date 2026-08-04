package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّؒۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12327l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C2403l f24408l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f24409l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f24410l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f24411l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C12951l f24412l;

    public C12327l(InterfaceC2262l interfaceC2262l, Function0 function0, C2403l c2403l, C12951l c12951l, InterfaceC8714l interfaceC8714l) {
        this.f24410l = interfaceC2262l;
        this.f24409l = function0;
        this.f24408l = c2403l;
        this.f24412l = c12951l;
        this.f24411l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((C18583l) obj).yandex;
        if (!AbstractC8669l.tapsense(AbstractC12460l.yandex, keyEvent.getKeyCode())) {
            return Boolean.FALSE;
        }
        int action = keyEvent.getAction();
        InterfaceC2262l interfaceC2262l = this.f24410l;
        C12951l c12951l = this.f24412l;
        C2403l c2403l = this.f24408l;
        if (action != 0) {
            if (action == 1) {
                InterfaceC8714l interfaceC8714l = this.f24411l;
                if (((Boolean) interfaceC8714l.getValue()).booleanValue()) {
                    interfaceC8714l.setValue(Boolean.FALSE);
                } else {
                    AbstractC10999l.mopub(interfaceC2262l, null, 0, new C11290l(c2403l, c12951l, null, 5), 3);
                    Function0 function0 = this.f24409l;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }
        } else if (keyEvent.getRepeatCount() == 0) {
            AbstractC10999l.mopub(interfaceC2262l, null, 0, new C11290l(c2403l, c12951l, null, 4), 3);
        }
        return Boolean.TRUE;
    }
}
