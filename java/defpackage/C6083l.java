package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؘۥٌ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6083l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f12854l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f12855l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f12856l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C16918l f12857l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f12858l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ ScrollCaptureCallbackC6465l f12859l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f12860l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6083l(ScrollCaptureCallbackC6465l scrollCaptureCallbackC6465l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f12859l = scrollCaptureCallbackC6465l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f12855l = obj;
        this.f12856l |= RecyclerView.UNDEFINED_DURATION;
        return ScrollCaptureCallbackC6465l.yandex(this.f12859l, null, null, this);
    }
}
