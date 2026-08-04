package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: renamed from: lًِٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llًِٛ;", "Llَّؓ;", "Llؚؗؐ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C8110l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object[] f16898l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f16899l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f16900l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final PointerInputEventHandler f16901l;

    public C8110l(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.f16900l = obj;
        this.f16899l = obj2;
        this.f16898l = objArr;
        this.f16901l = pointerInputEventHandler;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C4566l c4566l = (C4566l) abstractC14971l;
        Object obj = c4566l.f9261l;
        Object obj2 = this.f16900l;
        boolean z = !AbstractC8576l.yandex(obj, obj2);
        c4566l.f9261l = obj2;
        Object obj3 = c4566l.f9256l;
        Object obj4 = this.f16899l;
        if (!AbstractC8576l.yandex(obj3, obj4)) {
            z = true;
        }
        c4566l.f9256l = obj4;
        Object[] objArr = c4566l.f9259l;
        Object[] objArr2 = this.f16898l;
        if (objArr != null && objArr2 == null) {
            z = true;
        }
        if (objArr == null && objArr2 != null) {
            z = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z = true;
        }
        c4566l.f9259l = objArr2;
        Class<?> cls = c4566l.f9262l.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f16901l;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            c4566l.m1557l();
        }
        c4566l.f9262l = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8110l)) {
            return false;
        }
        C8110l c8110l = (C8110l) obj;
        if (!AbstractC8576l.yandex(this.f16900l, c8110l.f16900l) || !AbstractC8576l.yandex(this.f16899l, c8110l.f16899l)) {
            return false;
        }
        Object[] objArr = c8110l.f16898l;
        Object[] objArr2 = this.f16898l;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.f16901l == c8110l.f16901l;
    }

    public final int hashCode() {
        Object obj = this.f16900l;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f16899l;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f16898l;
        return this.f16901l.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C4566l(this.f16900l, this.f16899l, this.f16898l, this.f16901l);
    }
}
