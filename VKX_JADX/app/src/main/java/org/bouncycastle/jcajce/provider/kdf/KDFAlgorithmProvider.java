package org.bouncycastle.jcajce.provider.kdf;

import defpackage.AbstractC11043l;
import defpackage.Cfor;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
abstract class KDFAlgorithmProvider extends AlgorithmProvider {
    public void addKDFAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, Cfor cfor) {
        configurableProvider.addAlgorithm("KDF." + str, str2);
        if (cfor != null) {
            registerKDFAliasOid(configurableProvider, cfor, str);
        }
    }

    public void registerKDFAlias(ConfigurableProvider configurableProvider, String str, String str2) {
        configurableProvider.addAlgorithm("Alg.Alias.KDF." + str, str2);
    }

    public void registerKDFAliasOid(ConfigurableProvider configurableProvider, Cfor cfor, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.KDF." + cfor, str);
        AbstractC11043l.metrica(new StringBuilder("Alg.Alias.KDF.OID."), cfor, configurableProvider, str);
    }

    public void addKDFAlgorithm(ConfigurableProvider configurableProvider, String str, String str2) {
        addKDFAlgorithm(configurableProvider, str, str2, null);
    }
}
