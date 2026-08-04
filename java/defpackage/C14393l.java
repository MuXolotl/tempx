package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٓۙۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14393l implements Function8 {
    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int i;
        InterfaceC17242l interfaceC17242l = (InterfaceC17242l) obj;
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C3541l c3541l = (C3541l) obj4;
        Function3 function3 = (Function3) obj5;
        Function0 function0 = (Function0) obj6;
        C6956l c6956l = (C6956l) obj7;
        int iIntValue = ((Integer) obj8).intValue();
        if ((iIntValue & 6) == 0) {
            i = (c6956l.billing(interfaceC17242l) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= c6956l.billing(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= c6956l.mopub(zBooleanValue) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= c6956l.billing(c3541l) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= c6956l.admob(function3) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= c6956l.admob(function0) ? 131072 : 65536;
        }
        if (c6956l.m2127for(i & 1, (599187 & i) != 599186)) {
            AbstractC4830l.crashlytics(str, zBooleanValue, c3541l, interfaceC17242l, function3, function0, c6956l, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
