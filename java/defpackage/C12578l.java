package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FileInputStream;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: lّْٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12578l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f24758l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f24759l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f24760l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public FileInputStream f24761l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C4910l f24762l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C7761l f24763l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public FileLock f24764l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12578l(C7761l c7761l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f24763l = c7761l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f24759l = obj;
        this.f24760l |= RecyclerView.UNDEFINED_DURATION;
        return this.f24763l.amazon(null, this);
    }
}
