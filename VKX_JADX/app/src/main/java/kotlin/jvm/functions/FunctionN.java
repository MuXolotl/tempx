package kotlin.jvm.functions;

import defpackage.InterfaceC14328l;
import defpackage.InterfaceC18660l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J(\u0010\u0007\u001a\u00028\u00002\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H¦\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlin/jvm/functions/FunctionN;", "R", "Llٟٓٞ;", "Llۣٛ;", "", "", "args", "invoke", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "getArity", "()I", "arity", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface FunctionN<R> extends InterfaceC14328l, InterfaceC18660l {
    @Override // defpackage.InterfaceC18660l
    int getArity();

    R invoke(Object... args);
}
