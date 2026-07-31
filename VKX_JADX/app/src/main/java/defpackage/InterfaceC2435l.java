package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lؘؔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2435l extends InterfaceC10984l {
    boolean Signature(Object obj, int i, Map map);

    int admob();

    void clear();

    boolean contains(Object obj);

    void crashlytics(int i);

    boolean firebase(C15525l c15525l, int i, Map map);

    Object get(int i);

    InterfaceC2435l loadAd(InterfaceC7832l interfaceC7832l, LongPointerWrapper longPointerWrapper);

    /* JADX INFO: renamed from: package, reason: not valid java name */
    boolean mo1139package(Object obj, int i, LinkedHashMap linkedHashMap);

    boolean remove(Object obj);

    boolean removeAll(Collection collection);

    boolean subscription(Collection collection, int i, Map map);

    NativePointer yandex();
}
