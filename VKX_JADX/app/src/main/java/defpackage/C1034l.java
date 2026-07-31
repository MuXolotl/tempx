package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؒٓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1034l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f2868l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f2869l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f2870l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C3445l f2871l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Context f2872l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5518l f2873l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Throwable f2874l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1034l(AbstractC5518l abstractC5518l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f2873l = abstractC5518l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f2869l = obj;
        this.f2870l |= RecyclerView.UNDEFINED_DURATION;
        return this.f2873l.crashlytics(null, 0, this);
    }
}
